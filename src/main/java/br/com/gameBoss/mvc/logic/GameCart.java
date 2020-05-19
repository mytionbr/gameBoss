package br.com.gameBoss.mvc.logic;

import java.math.BigDecimal;
import java.util.ArrayList;
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
		ArrayList<Game> games = (ArrayList<Game>)sessao.getAttribute("gameCart");
		BigDecimal totalPrice = BigDecimal.ZERO;
		
//		for (int i = 0; i < games.size(); i++) {
//			totalPrice = totalPrice.add(games.get(i).getPrice());
//		}

		totalPrice = games.stream().map(Game::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
		
		request.setAttribute("games", games);
		request.setAttribute("totalPrice", totalPrice);
		request.setAttribute("sessionName", "GameCart");
		return "forward:gamecart.jsp";
	}

}
