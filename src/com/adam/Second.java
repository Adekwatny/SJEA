package com.adam;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Second extends HttpServlet{

	private static final long serialVersionUID = 2L;
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	{
		try {
			resp.getWriter().write("Second one");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
	{
		
	}
	

}
