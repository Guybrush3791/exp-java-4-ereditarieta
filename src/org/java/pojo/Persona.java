package org.java.pojo;

import java.time.LocalDate;

public class Persona {

	private String nome;
	private String cognome;
	private LocalDate dateOfBirth;
	private String cf;
	
	public Persona(String nome, String cognome, LocalDate dateOfBirth, String cf) {
		
		setNome(nome);
		setCognome(cognome);
		setDateOfBirth(dateOfBirth);
		setCf(cf);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	
	protected String getPersonString() {
		
		return getNome() + " " + getCognome() 
			+ "\ndata di nascita: " + getDateOfBirth()
			+ "\ncodice fiscale: " + getCf();
	}
	
	@Override
	public String toString() {
		
		return "(P) " + getPersonString();
	}
}
