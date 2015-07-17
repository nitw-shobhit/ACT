package com.act.web.exceptionhandler;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.act.util.exceptions.ApplicationException;

public class ExceptionHandler implements HandlerExceptionResolver {

	@Resource
	private SessionLocaleResolver localeResolver;

	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("errorPage");
		System.out.println(localeResolver.resolveLocale(request).getLanguage());
		mav.addObject("ErrorCode", ((ApplicationException)ex).getErrorCode());
		return null;
	}	
	
	public SessionLocaleResolver getLocaleResolver() {
		return localeResolver;
	}

	public void setLocaleResolver(SessionLocaleResolver localeResolver) {
		this.localeResolver = localeResolver;
	}
}
