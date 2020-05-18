package br.com.gameBoss.mvc.logic;

import java.util.Collection;
import java.util.Map;import java.util.function.Function;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.gameBoss.mvc.model.Game;

public class GameCart implements Logic{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession sessao = request.getSession();
		Collection<Game> games = (Collection)sessao.getAttribute("gameCart");
		
		request.setAttribute("games", games);
		
		return "forward:gamecart.jsp";
	}

}
