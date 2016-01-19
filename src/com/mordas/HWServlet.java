package com.mordas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HWServlet extends HttpServlet{
	 
	private String mylogin = "alyonaalive";
	private String mypassword = "12345";
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)

	throws ServletException, IOException {
		String log = request.getParameter("login");
		String pass = request.getParameter("password");
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();

		try {

			out.println("<html>");

			out.println("<head>");

			out.println("<title>Welcome</title>");

			out.println("</head>");

			out.println("<body>");
			if (log.equals(mylogin)&&pass.equals(mypassword)){
				out.println("<h1>Hello user</h1>");
				
			}
			else{
				out.println("<h1>Wrong password</h1>");
			}
			

			out.println("</body>");

			out.println("</html>");

		} finally {

			out.close();

		}

	

	}


	
}
