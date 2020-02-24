package model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ActionForward;

public interface Action {
	ActionForward execute(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException;
	
	
}

