package com.ebank.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ebank.bean.Login;
import com.ebank.service.LoginService;

/**
 * Servlet implementation class LoginSignInController
 */
@WebServlet("/LoginSignInController")
public class LoginSignInController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSignInController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		String typeofuser = request.getParameter("typeofuser");
		response.setContentType("text/html");
		Login ll = new Login();
		ll.setEmailid(emailid);
		ll.setPassword(password);
		ll.setTypeofuser(typeofuser);
		HttpSession hs = request.getSession();
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		
		LoginService ls = new LoginService();
		
		String result = ls.signIn(ll);
		RequestDispatcher rd1 = request.getRequestDispatcher("customerhome.jsp");
		RequestDispatcher rd2 = request.getRequestDispatcher("managerhome.jsp");
		
		if(result.equalsIgnoreCase("successfully login by customer")) {
			hs.setAttribute("name", ll.getEmailid());
			response.sendRedirect("customerhome.jsp");		// output wise equal to forward 
			
			//request.setAttribute("name", ll.getEmailid());
			//rd1.forward(request, response);
		}else if(result.equalsIgnoreCase("successfully login by manager")) {
			hs.setAttribute("name", ll.getEmailid());
			response.sendRedirect("managerhome.jsp");
			
			//request.setAttribute("name", ll.getEmailid());
			//rd2.forward(request, response);
		}else {
			pw.println("Invalid emailid or password");
			rd.include(request, response);
		}
		
	}

}
