package com.act.util.file;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.act.util.exceptions.FileLoadError;

public class PropertyUtils {

	public static Properties loadProperties(String fileName) throws FileLoadError {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Properties properties = new Properties();
			InputStream resourceStream = loader.getResourceAsStream(fileName);
			try {
				properties.load(resourceStream);
			} catch (IOException e) {
				throw new FileLoadError("File '"+fileName+"' could not be loaded", e);
			}
		
		return properties;
	}
}
