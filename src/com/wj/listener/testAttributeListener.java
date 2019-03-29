package com.wj.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class testAttributeListener
		implements ServletContextAttributeListener, HttpSessionAttributeListener, ServletRequestAttributeListener {

	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("====requestAttributeAdd...");

	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("====requestAttributeRemove...");

	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		System.out.println("====requestAttributeReplace...");

	}

	@Override
	public void attributeAdded(HttpSessionBindingEvent se) {
		System.out.println("$$$$sessionAttributeAdd...");

	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent se) {
		System.out.println("$$$$sessionAttributeRemove...");

	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent se) {
		System.out.println("$$$$sessionAttributeReplace...");

	}

	@Override
	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println("####servletAttributeAdd...");

	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		System.out.println("####servletAttributeRemove...");

	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		System.out.println("####servletAttributeReplace...");

	}

}
