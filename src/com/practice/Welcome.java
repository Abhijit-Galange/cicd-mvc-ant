package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {

	static {
		
		System.out.println("This is static block...");
		System.out.println("This is Sample MVC Web Project...");
		
	}
	
	@Override
	public void init() throws ServletException {				
		System.out.println("init()...");		
	}
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		System.out.println("service()...");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Hello Pune!!!</h1>");		
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy()...");
	}
	
	
}
