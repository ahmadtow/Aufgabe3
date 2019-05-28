package Aufgabe3;

import java.util.Comparator;

public class ArtikelNachBezComparator implements Comparator <Artikel> {

	@Override
	public int compare(Artikel a1, Artikel a2) {
		return a1.getBezeichnung().compareTo(a2.getBezeichnung());
	}

}
