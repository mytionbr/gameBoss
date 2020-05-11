package br.com.gameBoss.mvc.model.test;

import br.com.gameBoss.mvc.model.Client;
import br.com.gameBoss.mvc.model.dao.ClientDAO;

public class ClientVerificationTest {
	public static void main(String[] args) {
		ClientDAO dao = new ClientDAO();
		
		
		
		Client client = new Client();
		client.setEmail("matheus@gmail.com");
		client.setPassword("123");
		
		client = dao.verification(client);
		
		if(client == null){
			System.out.println("Access denied");
			System.out.println(client.getEmail());
		}else{
			System.out.println("Access allowed");
			System.out.println("welcome " + client.getName());
		}
		
	}
}
