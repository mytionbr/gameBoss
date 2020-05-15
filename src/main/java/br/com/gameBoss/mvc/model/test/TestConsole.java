package br.com.gameBoss.mvc.model.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.gameBoss.mvc.model.ConsoleGame;
import br.com.gameBoss.mvc.model.Game;
import br.com.gameBoss.mvc.model.dao.GameDAO;

public class TestConsole {
	
	public static void main(String[] args) {
		GameDAO dao = new GameDAO();
		
		Collection<Game> games = dao.searchList(Game.class);
		Collection<ConsoleGame> console = new ArrayList<>();
		Collection<Game> gamesNitento = new ArrayList<>();
		games.forEach(game ->{
			if(game.getConsole().contains(ConsoleGame.PC)){
				gamesNitento.add(game);
			}
		});
		gamesNitento.forEach(g ->{
			System.out.println(g.getName());
		});
		
	}
}
