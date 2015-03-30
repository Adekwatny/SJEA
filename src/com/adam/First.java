package com.adam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class First extends HttpServlet 
{
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
	{
		
		PrintWriter pw = resp.getWriter();
		pw.println("dziala");
		
		
		
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException
	{
		resp.getWriter().println("dziala doPost");
	}
}
