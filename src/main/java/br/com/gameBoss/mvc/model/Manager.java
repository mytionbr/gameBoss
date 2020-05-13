package br.com.gameBoss.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;



@Entity
public class Manager extends User{
	@Column(unique = true)
	private Integer accessCode;
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getAccessCode() {
		return accessCode;
	}

	public void setAccessCode(Integer accessCode) {
		this.accessCode = accessCode;
	}

	@Override
	public String toString() {
		return "Manager [accessCode=" + accessCode + ", toString()=" + super.toString() + "]";
	}

	
}
