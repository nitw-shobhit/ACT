package com.act.util.email;

import java.net.URISyntaxException;
import java.util.Properties;

import javax.ws.rs.core.MediaType;

import com.act.util.exceptions.EmailServiceFailureException;
import com.act.util.exceptions.FileLoadError;
import com.act.util.file.PropertyUtils;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class EmailUtils {

	public static void sendEmail(String to, String subject) throws EmailServiceFailureException, FileLoadError, URISyntaxException {
		
		Properties mgProp = PropertyUtils.loadProperties("mail_gun.properties");
		
        Client client = Client.create();
        client.addFilter(new HTTPBasicAuthFilter("api", mgProp.getProperty("mg.key")));

        WebResource webResource = client.resource(mgProp.getProperty("mg.url"));
        
        MultivaluedMapImpl formData = new MultivaluedMapImpl();
        formData.add("from", mgProp.getProperty("mg.from"));
        formData.add("to", to);
        formData.add("subject", subject);
        formData.add("text", mgProp.getProperty(subject+".mail.body"));
        formData.add("o:testmode", mgProp.getProperty("mg.flag"));
        ClientResponse cr = webResource.type(MediaType.APPLICATION_FORM_URLENCODED).post(ClientResponse.class, formData);
        if (cr.getStatus() != 200) {
        	throw new EmailServiceFailureException("Mailgun Failure : Could not send email notification");
        }
    }
}
