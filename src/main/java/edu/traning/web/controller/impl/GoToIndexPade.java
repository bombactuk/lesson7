package edu.traning.web.controller.impl;

import java.io.IOException;

import edu.traning.web.controller.Command;
import edu.traning.web.entity.News;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.ServletException;


public class GoToIndexPade implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		News news1  = new News("New Java Course!!!", "adasd iauhdiauhda iaudiauh","123");
		request.setAttribute("mainNews1", news1);
		
		News news2  = new News("Go!!!", "adasd iauhdiauhda iaudiauh","123");
		request.setAttribute("mainNews2", news2);
		
		News news3  = new News("Hello!!!", "adasd iauhdiauhda iaudiauh","123");
		request.setAttribute("mainNews3", news3);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/main_index.jsp");
		dispatcher.forward(request, response);
		
	}

}
