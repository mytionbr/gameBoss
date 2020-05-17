package br.com.gameBoss.mvc.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("game_boss");
	
	public EntityManager getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return emf.createEntityManager();
		
	}
}
