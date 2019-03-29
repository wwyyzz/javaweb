package com.wj.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class HelloServletListener implements ServletContextListener, ServletRequestListener, HttpSessionListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("--->servlet create...");

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("--->servlet destory...");

	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("--->session create...");
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("--->session destory...");
		
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("--->request create...");
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("--->request destory...");
		
	}

}
