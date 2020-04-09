package it.dstech.operations;

import java.io.IOException;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.db.GestioneDataBase;

@WebServlet(urlPatterns = "/rimuovilibro")
public class RimuoviLibro extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String titolo= req.getParameter("titolo");
		String azione= req.getParameter("azione");
		try {
			GestioneDataBase conn= new GestioneDataBase();
			if(azione.equals("1")) {
				conn.rimuoviLibro(titolo);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
