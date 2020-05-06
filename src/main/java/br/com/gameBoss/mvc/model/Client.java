package br.com.gameBoss.mvc.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Client extends User{
	
	@OneToMany
	private Collection<Game> shoppingCart;
	
	
	public Client() {
		super();
	}


	public Collection<Game> getShoppingCart() {
		return shoppingCart;
	}


	public void setShoppingCart(Collection<Game> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	
	
}
