package br.com.gameBoss.mvc.model.test;

import br.com.gameBoss.mvc.model.Client;
import br.com.gameBoss.mvc.model.Game;
import br.com.gameBoss.mvc.model.Manager;
import br.com.gameBoss.mvc.model.dao.GenericDAO;

public class TestFindById {
	public static void main(String[] args) {
		
		GenericDAO<Client> clientDAO = new GenericDAO<>();
		GenericDAO<Manager> managerDAO = new GenericDAO<>();
		GenericDAO<Game> gameDAO = new GenericDAO<>();
		
		Client client = clientDAO.findById(Client.class, 1L);
		System.out.println(client);
		
		Manager manager = managerDAO.findById(Manager.class, 1L);
		System.out.println(manager);
		
		Game game = gameDAO.findById(Game.class, 1L);
		System.out.println(game);
	}
}
