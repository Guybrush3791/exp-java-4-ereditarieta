package org.java.pojo;

import java.time.LocalDate;

public class Employee extends Persona {

	private int stipendio;
	private boolean tredicesima;
	private boolean quattordicesima;
	
	public Employee(String nome, String cognome, LocalDate dateOfBirth, String cf,
					int stipendio, boolean tredicesima, boolean quattordicesima) {
		
		super(nome, cognome, dateOfBirth, cf);
		
		setStipendio(stipendio);
		setTredicesima(tredicesima);
		setQuattordicesima(quattordicesima);
	}
	
	public int getStipendio() {
		return stipendio;
	}
	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}
	public boolean isTredicesima() {
		return tredicesima;
	}
	public void setTredicesima(boolean tredicesima) {
		this.tredicesima = tredicesima;
	}
	public boolean isQuattordicesima() {
		return quattordicesima;
	}
	public void setQuattordicesima(boolean quattordicesima) {
		this.quattordicesima = quattordicesima;
	}

	@Override
	public String toString() {
		
		return "(E) " + getPersonString()
			+ "\nstipendio: " + getStipendio() + "E"
			+ "\ntredicesima: " + isTredicesima()
			+ "\nquattordicesima: " + isQuattordicesima();
	}
}