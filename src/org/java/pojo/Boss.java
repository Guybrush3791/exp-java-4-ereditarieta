package org.java.pojo;

import java.awt.dnd.DropTargetContext;
import java.time.LocalDate;

public class Boss extends Persona {

	private int dividendo;
	private int bonus;
	
	public Boss(String nome, String cognome, LocalDate dateOfBirth, String cf,
				int dividendo, int bonus) {
		
		super(nome, cognome, dateOfBirth, cf);
		
		setDividendo(dividendo);
		setBonus(bonus);
	}

	public int getDividendo() {
		return dividendo;
	}
	public void setDividendo(int dividendo) {
		this.dividendo = dividendo;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		
		return "(B) " + getPersonString()
			+ "\ndividendo: " + getDividendo() + "E"
			+ "\nbonus: " + getBonus() + "E";
	}
}
