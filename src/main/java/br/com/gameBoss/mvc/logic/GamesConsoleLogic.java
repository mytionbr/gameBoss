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

public class GamesConsoleLogic implements Logic{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		
		GameDAO dao = new GameDAO();
		String consoleName = request.getParameter("game");
		System.out.println(consoleName);
		Collection<Game> games = dao.searchList(Game.class);
		Collection<Game> gamesConsole = new ArrayList<>();
		
		games.forEach(game ->{
			Collection<ConsoleGame> consoles = game.getConsole();
			
			consoles.forEach(console ->{
				System.out.println(console);
				if(console.toString().equals(consoleName)){
					gamesConsole.add(game);
					System.out.println("Edededeededede");
				}else {
					System.out.println("wescdcdecdcdc");
				}
			});
			
			
		});
		request.setAttribute("games", gamesConsole);
		return "forward:games.jsp";
	}

}
