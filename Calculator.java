 package com.ty.calciApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Calculator  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int num1=Integer.parseInt(req.getParameter("n1"));
		int num2=Integer.parseInt(req.getParameter("n2"));
		 PrintWriter ref=resp.getWriter();

		
		String str=req.getParameter("op");
		double result=0;
		if(str.equals("add"))
		{
			result=num1+num2;
			ref.println("<html><body bgcolor='yellow'>"+" <h1>addition of 2 number is"+result +" </h1></body></html>" );
			
		}
		else if(str.equals("sub"))
		{
			result=num1-num2;
			ref.println("<html><body bgcolor='yellow'>"+" <h1>substaction of 2 number is"+result +" </h1></body></html>" );
		}
		else if(str.equals("mul"))
		{
			result=num1*num2;
			ref.println("<html><body bgcolor='yellow'>"+" <h1>multiplication of 2 number is"+result +" </h1></body></html>" );
		}
		else if(str.equals("div"))
		{
			result=num1/num2;
			ref.println("<html><body bgcolor='yellow'>"+" <h1>division of 2 number is"+result +" </h1></body></html>" );
		}
		else
		{
			result=num1+num2;
		int	result1=num1-num2;
		int	result2=num1*num2;
		int	result3=num1/num2;
		ref.println("<html><body bgcolor='yellow'>"+" <h1>addition of 2 number is"+result +" </h1></body></html>" );
		ref.println("<html><body bgcolor='yellow'>"+" <h1>substaction of 2 number is"+result1 +" </h1></body></html>" );
		ref.println("<html><body bgcolor='yellow'>"+" <h1>multiplication of 2 number is"+result2 +" </h1></body></html>" );
		ref.println("<html><body bgcolor='yellow'>"+" <h1>division of 2 number is"+result3 +" </h1></body></html>" );
		
		}
		
		
		
		
	
		
		
		
	}
}
