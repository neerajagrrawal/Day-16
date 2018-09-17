package com.capgemini.bankapplication.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/logout.do")
public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    RequestDispatcher dispatcher = null;
  
    public LogoutController() {
        super();
        
    }
    
    
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		dispatcher = request.getRequestDispatcher("logout.jsp");
		 dispatcher.forward(request, response);
	}

}