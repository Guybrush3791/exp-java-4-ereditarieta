package org.java;

import java.time.LocalDate;

import org.java.pojo.Boss;
import org.java.pojo.Employee;
import org.java.pojo.Persona;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("------------------------------------\n");
		
		Persona p1 = new Persona("Guybrush", "Threepwood", LocalDate.now(), "GYBTHRSDFSDF");
		System.out.println(p1);
//		System.out.println(p1.getPersonString());
		
		System.out.println("\n------------------------------------\n");
		
		Employee e1 = new Employee("Marco", "Rossi", LocalDate.now(), "MRCRSSASDFAS", 1600, true, true);
		System.out.println(e1);
		
		System.out.println("\n------------------------------------\n");
		
		Boss b1 = new Boss("Chiara", "Bianchi", LocalDate.now(), "CHABNCASDFASD", 4500, 5500);
		System.out.println(b1);
		
		System.out.println("\n------------------------------------");
		System.out.println("------------------------------------\n");
		
		Persona[] pArr = { p1, e1, b1 };
		for (int x=0;x<pArr.length;x++) {
			
			Persona p = pArr[x];
			System.out.println(p.toString());
			
			System.out.println("\n------------------------------------\n");
			if (p instanceof Employee) {
				
				Employee e = (Employee) p;
				System.out.println(e.getStipendio());
			} else if (p instanceof Boss) {
				
				Boss b = (Boss) p;
				System.out.println(b.getDividendo());
			}
		}
	}
}