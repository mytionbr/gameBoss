package br.com.gameBoss.mvc.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

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
import javax.servlet.http.HttpSession;

import br.com.gameBoss.mvc.logic.NavBarLogic;
import br.com.gameBoss.mvc.model.Game;
import br.com.gameBoss.mvc.model.User;

@WebFilter("/*")

public class UserFilter implements Filter {


	public void init(FilterConfig fConfig) throws ServletException {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse rep = (HttpServletResponse) response;
		
		HttpSession sessao = req.getSession();
		
		if(sessao.getAttribute("user") == null){
			User user = new User();
			Collection<Game> games = new ArrayList<Game>();
			
			sessao.setAttribute("user", user);
			sessao.setAttribute("gameCart", games);
		}
		
		
		
		chain.doFilter(request, response);
		
	}

}