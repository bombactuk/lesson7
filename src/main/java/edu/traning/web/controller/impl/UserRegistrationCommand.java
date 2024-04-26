package edu.traning.web.controller.impl;

import java.io.IOException;

import edu.traning.web.controller.Command;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserRegistrationCommand implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("username " + request.getParameter("username"));
		System.out.println("password " + request.getParameter("password"));
		System.out.println("name " + request.getParameter("name"));
		System.out.println("dob " + request.getParameter("dob"));
		//LocalDate date = LocalDate.parse(request.getParameter("dob"));
		System.out.println("country " + request.getParameter("country"));
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

}
