package it.dstech.modelli;

import java.util.ArrayList;
import java.util.List;

public class Utente {
	private String username;
	private String password;
	private String ruolo;
	private double fondo;
	private List<Collezione> collezione;

	public Utente(String username, String password, String ruolo, double fondo, List<Collezione> collezione) {
		super();
		this.username = username;
		this.password = password;
		this.ruolo = ruolo;
		this.fondo = fondo;
		this.collezione = new ArrayList<>();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public double getFondo() {
		return fondo;
	}

	public void setFondo(double fondo) {
		this.fondo = fondo;
	}

	public List<Collezione> getCollezione() {
		return collezione;
	}

	public void setCollezione(List<Collezione> collezione) {
		this.collezione = collezione;
	}

	@Override
	public String toString() {
		return "Utente [username=" + username + ", password=" + password + ", ruolo=" + ruolo + ", fondo=" + fondo
				+ ", collezione=" + collezione + "]";
	}

}
