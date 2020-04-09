package it.dstech.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.db.GestioneDataBase;

@WebServlet(urlPatterns = "/menudipendente")
public class ControllerDipendente extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String azione= req.getParameter("connessione");
	try {
		GestioneDataBase conn = new GestioneDataBase();
		if(azione.equals("1")) {
			req.getRequestDispatcher("/aggiungi.jsp").forward(req, resp);
			
		}else if(azione.equals("2")) {
			req.setAttribute("lista", conn.stampaLibri());
			req.getRequestDispatcher("/modifica.jsp").forward(req, resp);
		}else if(azione.equals("3")) {
			req.setAttribute("lista", conn.stampaLibri());
			req.getRequestDispatcher("/rimuovilibro.jsp").forward(req, resp);
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	}


