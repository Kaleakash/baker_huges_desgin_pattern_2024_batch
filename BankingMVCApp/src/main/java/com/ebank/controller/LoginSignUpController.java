package com.ebank.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ebank.bean.Login;
import com.ebank.service.LoginService;

/**
 * Servlet implementation class LoginSignUpController
 */
@WebServlet("/LoginSignUpController")
public class LoginSignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSignUpController() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		
		RequestDispatcher rd = request.getRequestDispatcher("signUp.jsp");
		
		LoginService ls = new LoginService();
		
		String result = ls.signUp(ll);
		pw.println(result);
		rd.include(request, response);
		
	}

}
