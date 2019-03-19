package com.wj.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setAttribute("name", "abcde");
		System.out.println("forward attr name : " + request.getAttribute("name"));
		
		System.out.println("ForwardServlet's doGET");
		
		String path = "testServlet";
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/" + path);
		requestDispatcher.forward(request, response);
		
		
	}

}
