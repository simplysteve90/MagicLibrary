package it.dstech.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import it.dstech.modelli.Libro;
import it.dstech.modelli.Utente;

public class GestioneDataBase {
	private Connection connessione;

	public GestioneDataBase() throws SQLException, ClassNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("application.properties"));
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		String url = prop.getProperty("url");
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.connessione = DriverManager.getConnection(url, username, password);

	}

	public Connection getConnessione() {
		return connessione;
	}

	public void setConnessione(Connection connessione) {
		this.connessione = connessione;
	}

	public Utente verificaUtente(String username, String psw, String ruolo) throws SQLException {
		PreparedStatement prep = connessione.prepareStatement("select * from utente where username=? and password=?;");
		prep.setString(1, username);
		prep.setString(2, psw);
		ResultSet res = prep.executeQuery();
		while (res.next()) {
			String u = res.getString("username");
			String pass = res.getString("password");
			String posizione = res.getString("ruolo");
			double fondo = res.getDouble("fondo");
			Utente omino = new Utente(u, pass, posizione, fondo);
			return omino;
		}
		return null;

	}

	public Utente creazioneAccount(String username, String password, String ruolo, double fondo) throws SQLException {
		PreparedStatement prep = connessione
				.prepareStatement("insert into utente (username, password, fondo, ruolo)values(?,?,?,?);");
		prep.setString(1, username);
		prep.setString(2, password);
		prep.setDouble(3, fondo);
		prep.setString(4, ruolo);
		prep.execute();
		Utente u = new Utente(username, password, ruolo, fondo);
		System.out.println("utente creato");
		return u;

	}

	public Libro creaLibro(String titolo, double costo, int qtavendita, int qtanoleggio, String autore)
			throws SQLException {
		PreparedStatement prep = connessione.prepareStatement(
				"insert into libro (titolo, costo, qtavendita, qtanoleggio, autore) values(?,?,?,?,?);");
		prep.setString(1, titolo);
		prep.setDouble(2, costo);
		prep.setInt(3, qtavendita);
		prep.setInt(4, qtanoleggio);
		prep.setString(5, autore);
		prep.execute();
		Libro libro = new Libro(titolo, autore, costo, qtavendita, qtanoleggio);
		return libro;
	}

	public List<Libro> stampaLibri() throws SQLException {
		PreparedStatement prep = connessione.prepareStatement("select * from libro;");
		ResultSet res = prep.executeQuery();
		List<Libro> listaLibri = new ArrayList<>();
		while (res.next()) {
			Libro libro = new Libro(res.getString("titolo"), res.getString("autore"), res.getDouble("costo"),
					res.getInt("qtavendita"), res.getInt("qtanoleggio"));
			listaLibri.add(libro);

		}
		return listaLibri;

	}

	public void modificaLibro(String nuovoTitolo, String titolo, String autore, double costo, int qtavendita,
			int qtanoleggio) throws SQLException {
		PreparedStatement prep = connessione.prepareStatement(
				"update libro set titolo=?, costo=?, qtavendita=?, qtanoleggio=?, autore=? where titolo=?;	");
		prep.setString(1, nuovoTitolo);
		prep.setDouble(2, costo);
		prep.setInt(3, qtavendita);
		prep.setInt(4, qtanoleggio);
		prep.setString(5, autore);
		prep.setString(6, titolo);

		prep.execute();

	}

	public void rimuoviLibro(String titolo) throws SQLException {
		PreparedStatement prep= connessione.prepareStatement("delete from libro where titolo=?;");
		prep.setString(1, titolo);
		prep.execute();
	}

	
}
