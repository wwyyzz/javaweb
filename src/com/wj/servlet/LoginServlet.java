package com.wj.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class LoginServlet implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("request is coming!");
		
		System.out.println(request.getParameter("user"));
		System.out.println(request.getParameter("password"));
		
		String[] interesting= request.getParameterValues("interesting");
		
		for (String string : interesting) {
			System.out.println(string);
		}
		
		Enumeration<String> names = request.getParameterNames(); 
		while (names.hasMoreElements()) {
			String name = (String) names.nextElement();
			String val = request.getParameter(name);
			System.out.println(name + ":" + val);
		}
		
		Map<String, String[]> map = request.getParameterMap();
		System.out.println("getParameterMap");
		for(Map.Entry<String, String[]> entry: map.entrySet()) {
			System.out.println(entry.getKey() + ":" + Arrays.asList(entry.getValue()));
		}
		
		HttpServletRequest httpServletRequest = (HttpServletRequest)request;
		
		System.out.println("requestURI:" + httpServletRequest.getRequestURI());
		
		System.out.println("request method:" + httpServletRequest.getMethod());
		
		System.out.println("request servlet :" + httpServletRequest.getServletPath());
		
		System.out.println("request servlet Port :" + httpServletRequest.getServerPort());
		
//		==========response
		PrintWriter printWriter = response.getWriter();		
		printWriter.print("hello world....");
//		response.setContentType("application/msword");
	}

}
