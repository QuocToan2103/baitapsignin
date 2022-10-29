package com.ltphuc.k18.repositorynodb.config;



import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class Applicationinit extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { Applicationconfig.class };
	}
 
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
