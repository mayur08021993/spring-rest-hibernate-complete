package com.bazinga.app;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletCtx) throws ServletException {
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(AppConfig.class);
		rootContext.setServletContext(servletCtx);
		
		DispatcherServlet dispatcherServlet= new DispatcherServlet(rootContext);
		ServletRegistration.Dynamic servlet=servletCtx.addServlet("dispatcher", dispatcherServlet);
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
	}

}
