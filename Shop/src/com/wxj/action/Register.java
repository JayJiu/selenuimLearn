package com.wxj.action;

import com.wxj.entity.User;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

public class Register extends HttpServlet{
	private User user;
	private String username;
	private String password;
	private String phone;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		Register uBean = new Register();
		request.setAttribute("userBean", uBean);
		username = request.getParameter("name");
		password = request.getParameter("password");
		phone = request.getParameter("phone");
		System.out.println(username + " " + password + " " + phone);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws
	ServletException,IOException{
		doGet(request, response);
	}
}
