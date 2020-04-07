package it.dstech.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.db.GestioneDataBase;
import it.dstech.modelli.Utente;

@WebServlet(urlPatterns = "/registrazione")
public class ControllerRegistrazione extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String ruolo = req.getParameter("ruolo");
		double fondo = Double.parseDouble(req.getParameter("fondo"));
		String azione = req.getParameter("azione");
		try {
			GestioneDataBase conn = new GestioneDataBase();
			if (azione.equals("1")) {
				if (ruolo.equals("dipendente")) {
					Utente utente = conn.creazioneAccount(username, password, ruolo, fondo);
					req.getRequestDispatcher("/menudipendente.jsp").forward(req, resp);
				} else if(ruolo.equals("cliente")) {
					Utente utente = conn.creazioneAccount(username, password, ruolo, fondo);
					req.getRequestDispatcher("/menucliente.jsp").forward(req, resp);

				}
			} else {

			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
