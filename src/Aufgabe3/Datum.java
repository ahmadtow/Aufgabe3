package Aufgabe3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Datum { 
	private int tag;
	private int monat;
	private int jahr;

	public void init(int tag, int monat, int jahr) {
		this.tag = tag;
		this.monat = monat;
		this.jahr = jahr;
	}

	public Datum(int tag, int monat, int jahr) { 
		this.tag = tag;
		this.monat = monat;
		this.jahr = jahr;
	}

	public Datum() {
		
	}

	public void init() {
		
		GregorianCalendar c = new GregorianCalendar();

		this.tag = c.get(Calendar.DATE);
		this.monat = c.get(Calendar.MONTH) + 1;
		this.jahr = c.get(Calendar.YEAR);
	}

	public void print() {
		System.out.println(tag + "." + monat + "." + jahr);
	}
}