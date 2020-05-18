package br.com.gameBoss.mvc.logic;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.gameBoss.mvc.model.Game;
import br.com.gameBoss.mvc.model.dao.GameDAO;

public class AddGameToCart implements Logic{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String idString = request.getParameter("id");
		Long id = Long.parseLong(idString);
		System.out.println(id);
		GameDAO dao = new GameDAO();
		Game game = dao.findById(Game.class, id);
		HttpSession sessao = request.getSession();
		Collection<Game> gameCart = (Collection)sessao.getAttribute("gameCart");
		
		
		gameCart.add(game);
		request.setAttribute("gameCart", gameCart);
		
		return "redirect:entry?logic=GameCart";
	}

}
