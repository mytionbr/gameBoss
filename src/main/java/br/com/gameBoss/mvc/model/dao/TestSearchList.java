package br.com.gameBoss.mvc.model.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.gameBoss.mvc.model.Client;
import br.com.gameBoss.mvc.model.Game;
import br.com.gameBoss.mvc.model.Manager;
import br.com.gameBoss.mvc.model.User;

public class TestSearchList {
	public static void main(String[] args) {
		
		GenericDAO<Client> clientDAO = new GenericDAO<>();
		GenericDAO<Manager> managerDAO = new GenericDAO<>();
		GenericDAO<Game> gameDAO = new GenericDAO<>();
		
		List<Client> clients = new ArrayList<Client>(); 
		List<Manager> managers = new ArrayList<Manager>(); 
		List<Game> games = new ArrayList<Game>(); 
		
		clients = (List<Client>) clientDAO.searchList(Client.class);
		
		clients.forEach(client ->{
			System.out.println(client.getName());
		});
	}
}
