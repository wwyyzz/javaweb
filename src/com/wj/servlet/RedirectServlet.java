package com.wj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("name", "abcde");
		System.out.println("redirect attr name : " + request.getAttribute("name"));
		
		
		System.out.println("RedirectServlet's doGET");
		
		String path = "testServlet" ;
		
		response.sendRedirect(path);
	}

}
