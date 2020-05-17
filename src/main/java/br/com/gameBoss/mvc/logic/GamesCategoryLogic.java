package br.com.gameBoss.mvc.logic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gameBoss.mvc.model.Category;
import br.com.gameBoss.mvc.model.ConsoleGame;
import br.com.gameBoss.mvc.model.Game;
import br.com.gameBoss.mvc.model.dao.GameDAO;

public class GamesCategoryLogic implements Logic{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		String gameName = request.getParameter("game");
		System.out.println(gameName);
		GameDAO dao = new GameDAO();
		
		Collection<Game> games = dao.searchList(Game.class);
		Collection<Game> gamesCategory = new ArrayList<Game>();
	
		games.forEach(game ->{
			
			if(game.getCategory().toString().equals(gameName)){
				gamesCategory.add(game);
			}
		});
		
		request.setAttribute("games", gamesCategory);
		return "forward:games.jsp";
	}

}
