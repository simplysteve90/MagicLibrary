package it.dstech.operations;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.db.GestioneDataBase;

@WebServlet (urlPatterns = "/modifica")
public class ModificaLibro extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String titolo=  req.getParameter("titolo");
		String autore= req.getParameter("autore");
		double costo= Double.parseDouble(req.getParameter("costo"));
		int qtavendita= Integer.parseInt(req.getParameter("qtavendita"));
		int qtanoleggio= Integer.parseInt(req.getParameter("qtanoleggio"));
		String azione= req.getParameter("connessione");
		String libro= req.getParameter("libro");
		try {
			GestioneDataBase conn = new GestioneDataBase();

			if(azione.equals("1")) {
				
				
			}else if(azione.equals("2")) {
				req.getRequestDispatcher("/menudipendente.jsp").forward(req, resp);	
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
