package com.wj.servlet;
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;;

public class LoginServlet2 extends GenericServlet{

	@Override
	public void service(ServletRequest request, ServletResponse res) throws ServletException, IOException {
		System.out.println(request.getParameter("user"));
		System.out.println(request.getParameter("password"));
		
	}

}
