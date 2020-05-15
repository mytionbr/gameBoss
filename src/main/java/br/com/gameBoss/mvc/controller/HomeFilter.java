package br.com.gameBoss.mvc.controller;

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

@WebFilter("/")
public class HomeFilter implements Filter {

	public HomeFilter() {

	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse rep = (HttpServletResponse) response;

		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/home.jsp");
		List<ConsoleGame> consoles = new ArrayList<ConsoleGame>(Arrays.asList(ConsoleGame.values()));
		List<Category> categories = new ArrayList<Category>(Arrays.asList(Category.values()));
		req.setAttribute("consoles", consoles);
		req.setAttribute("categories", categories);
		rd.forward(req, rep);
	
		
	}

}
