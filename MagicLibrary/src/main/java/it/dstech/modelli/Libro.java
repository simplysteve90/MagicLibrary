package it.dstech.modelli;

public class Libro {
	private String titolo;
	private String autore;
	private double costo;
	private int qtavendita;
	private int qtanoleggio;

	public Libro(String titolo, String autore, double costo, int qtavendita, int qtanoleggio) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.costo = costo;
		this.qtavendita = qtavendita;
		this.qtanoleggio = qtanoleggio;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getQtavendita() {
		return qtavendita;
	}

	public void setQtavendita(int qtavendita) {
		this.qtavendita = qtavendita;
	}

	public int getQtanoleggio() {
		return qtanoleggio;
	}

	public void setQtanoleggio(int qtanoleggio) {
		this.qtanoleggio = qtanoleggio;
	}

	@Override
	public String toString() {
		return titolo +" "+ autore +" "+ costo +" "+ qtavendita +" "+ qtanoleggio  ;
	}

}
