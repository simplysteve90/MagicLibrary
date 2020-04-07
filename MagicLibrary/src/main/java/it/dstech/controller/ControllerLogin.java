package it.dstech.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.dstech.db.GestioneDataBase;
import it.dstech.modelli.Utente;

@WebServlet("/login")
public class ControllerLogin extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String messaggio = req.getParameter("messaggio");
		req.setAttribute("messaggio", messaggio);
		req.getRequestDispatcher("/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String psw = req.getParameter("password");
		String ruolo= req.getParameter("ruolo");
		String azione = req.getParameter("connessione");
		try {
			if (azione.equals("1")) {

				GestioneDataBase conn = new GestioneDataBase();
				Utente utente = conn.verificaUtente(username, psw, ruolo);

				if (utente == null) {
					String messaggio = messaggioErroreLogin();
					req.setAttribute("messaggio", messaggio);
					req.getRequestDispatcher("/login.jsp").forward(req, resp);
					// ti mando sulla pagina di errore

				} else if (utente.getRuolo().equals("cliente")) {
					req.getRequestDispatcher("/menucliente.jsp").forward(req, resp);

					// ti mando sulla pagina cliente
				} else {
					req.getRequestDispatcher("/menudipendente.jsp").forward(req, resp);
					// ti mando sulla pagina del dipendente
				}
			}else {
			req.getRequestDispatcher("/registrazione.jsp").forward(req, resp);
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	private String messaggioErroreLogin() {
		return "Utente inesistente, registrati per accedere ai servizi.";

	}

}
