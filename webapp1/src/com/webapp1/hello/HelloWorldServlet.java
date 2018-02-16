package com.webapp1.hello;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.util.Date;
import java.math.*;
import java.util.*;
/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/fibonacci")
public class HelloWorldServlet extends HttpServlet {
	static BigInteger fib(int n)
    {   
        
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(0);
        if (n==0)
            return c;
        for (int i = 2; i <= n; i++)
        {
            c = a.add(b);
            a = b;
            b = c;
        }
        return b;
    }
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorldServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			String tvalue=request.getParameter("textbox1");
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		int n=Integer.parseInt(tvalue);
		for(int i=1;i<=n;i++)
		out.print(fib(i) + " ");
		}
		catch(Exception e)
		{
			 System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
