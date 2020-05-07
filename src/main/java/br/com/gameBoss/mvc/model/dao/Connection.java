package br.com.gameBoss.mvc.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("game_boss");
	
	public EntityManager getConnection(){
		
		return emf.createEntityManager();
		
	}
}
