package br.com.gameBoss.mvc.model.test;

import br.com.gameBoss.mvc.model.Manager;
import br.com.gameBoss.mvc.model.dao.ManagerDAO;

public class ManagerVerificationTest {
	public static void main(String[] args) {
		ManagerDAO dao = new ManagerDAO();
		
		Manager manager = new Manager();
		manager.setAccessCode(1234);
		manager.setPassword("122");
		
		manager = dao.verification(manager);
		
		if(manager == null){
			System.out.println("Access denied");
		}else{
			System.out.println("Access allowed");
			System.out.println("Welcome " + manager.getName());
		}
		
	}
}
