package br.com.gameBoss.mvc.model.dao;


import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.gameBoss.mvc.model.Client;

public class ClientDAO extends GenericDAO<Client>{

	public Client verification(Client client){
		
		TypedQuery<Client> query = getEm().createQuery(
				"select c from Client c where c.email = :pEmail and c.password = :pPassword", Client.class);
		
		query.setParameter("pEmail", client.getEmail());
		query.setParameter("pPassword", client.getPassword());
		try {
			client = query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
		finally{
			getEm().close();
		}
		return client;
	}
	
}


