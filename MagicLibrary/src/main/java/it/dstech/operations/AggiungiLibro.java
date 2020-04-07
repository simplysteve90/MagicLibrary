package it.dstech.operations;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.db.GestioneDataBase;
import it.dstech.modelli.Libro;

@WebServlet(urlPatterns = "/aggiungi")
public class AggiungiLibro extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String titolo = req.getParameter("titolo");
		double costo = Double.parseDouble(req.getParameter("costo"));
		int qtavendita = Integer.parseInt(req.getParameter("qtavendita"));
		int qtanoleggio = Integer.parseInt(req.getParameter("qtanoleggio"));
		String autore = req.getParameter("autore");
		String azione = req.getParameter("connessione");
		try {
			GestioneDataBase gest = new GestioneDataBase();
			if (azione.equals("1")) {
				Libro libro= gest.creaLibro(titolo, costo, qtavendita, qtanoleggio, autore);

		}else {
			}
		}
			catch (Exception e) {
				e.printStackTrace();
		}
		}
	
	}

