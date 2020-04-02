package it.dstech.modelli;

import java.util.ArrayList;
import java.util.List;

public class Collezione {
	private int idlibro;
	private int idutente;
	private String data;
	private List<Libro> listaLibri;

	public Collezione(int idlibro, int idutente, String data, List<Libro> listaLibri) {
		super();
		this.idlibro = idlibro;
		this.idutente = idutente;
		this.data = data;
		this.listaLibri = new ArrayList<>();
	}

	public int getIdlibro() {
		return idlibro;
	}

	public void setIdlibro(int idlibro) {
		this.idlibro = idlibro;
	}

	public int getIdutente() {
		return idutente;
	}

	public void setIdutente(int idutente) {
		this.idutente = idutente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<Libro> getListaLibri() {
		return listaLibri;
	}

	public void setListaLibri(List<Libro> listaLibri) {
		this.listaLibri = listaLibri;
	}

	@Override
	public String toString() {
		return "Collezione [idlibro=" + idlibro + ", idutente=" + idutente + ", data=" + data + ", listaLibri="
				+ listaLibri + "]";
	}

}
