package br.com.gameBoss.mvc.model.dao;

import javax.persistence.TypedQuery;

import br.com.gameBoss.mvc.model.Client;
import br.com.gameBoss.mvc.model.Manager;

public class ManagerDAO extends GenericDAO<Manager> {
	public Manager verification(Manager manager) {

		TypedQuery<Manager> query = getEm().createQuery(
				"select m from Manager m where m.accessCode = :pAccessCode and m.password = :pPassword", Manager.class);

		query.setParameter("pAccessCode", manager.getAccessCode());
		query.setParameter("pPassword", manager.getPassword());
		try {
			manager = query.getSingleResult();
		} catch (Exception e) {
			return null;
		} finally {
			getEm().close();
		}
		return manager;
	}
}
