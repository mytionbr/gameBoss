package br.com.gameBoss.mvc.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateTables {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("game_boss");
		EntityManager em = emf.createEntityManager();
		em.close();
	}
}
