package br.com.gameBoss.mvc.model;

import java.math.BigDecimal;
import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CollectionType;

import com.mysql.cj.xdevapi.Type;

@Entity
public class Game implements BaseEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public String name;
	public String description;
	public BigDecimal price;
	@Enumerated(EnumType.STRING)
	public Category category;
	@ElementCollection(targetClass = ConsoleGame.class, fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	public Collection<ConsoleGame> console;

	

	public Collection<ConsoleGame> getConsole() {
		return console;
	}

	public void setConsole(Collection<ConsoleGame> console) {
		this.console = console;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String nome) {
		this.name = nome;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}


	

	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", category="
				+ category + "]";
	}
	

}
