package br.com.gameBoss.mvc.logic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gameBoss.mvc.model.Category;
import br.com.gameBoss.mvc.model.ConsoleGame;



public class NavBarLogic implements Logic{
		
		@Override
		public String execute(HttpServletRequest request, HttpServletResponse response) {
			List<ConsoleGame> consoles = new ArrayList<ConsoleGame>(Arrays.asList(ConsoleGame.values()));
			List<Category> categories = new ArrayList<Category>(Arrays.asList(Category.values()));
			request.setAttribute("consoles", consoles);
			request.setAttribute("categories", categories);
			return null;
		}
		

		
	
		
	

}
