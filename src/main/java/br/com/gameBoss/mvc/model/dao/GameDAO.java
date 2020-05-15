package br.com.gameBoss.mvc.model.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.gameBoss.mvc.model.Client;
import br.com.gameBoss.mvc.model.ConsoleGame;
import br.com.gameBoss.mvc.model.Game;

public class GameDAO extends GenericDAO<Game>{
	private EntityManager em = new Connection().getConnection();
	
}
