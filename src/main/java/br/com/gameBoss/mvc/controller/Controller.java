package br.com.gameBoss.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gameBoss.mvc.logic.Logic;
import br.com.gameBoss.mvc.logic.NavBarLogic;

@WebServlet("/entry")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Controller() {
        super();
       
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Access controller");
		
		String parameter = request.getParameter("logic");
		String nameClass = "br.com.gameBoss.mvc.logic." + parameter;
		String responseOfLogic;
	
			
			try {
				Class clazz = Class.forName(nameClass);
				Logic logic = (Logic) clazz.newInstance();
				responseOfLogic = logic.execute(request, response);
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				throw new  ServletException(e);
			}
			String[] adressAndType = responseOfLogic.split(":");
			NavBarLogic navBarLogic = new NavBarLogic();
			navBarLogic.execute(request, response);
			if(adressAndType[0].equals("forward")){
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/"+adressAndType[1]);
				rd.forward(request, response);
			}else{
				response.sendRedirect(adressAndType[1]);
			}
		
	}

}
