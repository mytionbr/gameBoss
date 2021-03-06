package br.com.gameBoss.mvc.model.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.gameBoss.mvc.model.Category;
import br.com.gameBoss.mvc.model.Client;
import br.com.gameBoss.mvc.model.ConsoleGame;
import br.com.gameBoss.mvc.model.Game;
import br.com.gameBoss.mvc.model.Manager;
import br.com.gameBoss.mvc.model.User;
import br.com.gameBoss.mvc.model.dao.ClientDAO;
import br.com.gameBoss.mvc.model.dao.GenericDAO;

public class TestSaveUpdadeDao {
	public static void main(String[] args) {
		
		Game game1 = new Game();
		game1.setName("FIFA");
		game1.setCategory(Category.SPORT);
		game1.setDescription("SEDEDEDEDEDEDEDED");
		game1.setPrice(new BigDecimal(12.00));
		game1.setConsole(Arrays.asList(ConsoleGame.PC,ConsoleGame.XBOX,ConsoleGame.PLAYSTATION,ConsoleGame.NINTENTO));
		
		Game game2 = new Game();
		game2.setName("World of tanks");
		game2.setCategory(Category.ACTION);
		game2.setDescription("ocsdcdscsdcwefbyny");
		game2.setPrice(new BigDecimal(9.00));
		game2.setConsole(Arrays.asList(ConsoleGame.PC,ConsoleGame.XBOX,ConsoleGame.PLAYSTATION));
		/*
		Client user1 = new Client();
		user1.setName("Matheus");
		user1.setEmail("matheus@gmail.com");
		user1.setPassword("123");
		user1.setShoppingCart(Arrays.asList(game1,game2));
		
		Manager user2 = new Manager();
		user2.setName("Joao");
		user2.setEmail("joao@gmail.com");
		user2.setPassword("122");
		user2.setAccessCode(1234);
		
		GenericDAO<Client> clientDAO = new GenericDAO<>();
		
		GenericDAO<Manager> managerDAO = new GenericDAO<>();
		
		
		clientDAO.saveOrUpdate(user1);
		managerDAO.saveOrUpdate(user2);
		*/
		GenericDAO<Game> gameDAO = new GenericDAO<>();
		gameDAO.saveOrUpdate(game1);
		gameDAO.saveOrUpdate(game2);
	}
}
