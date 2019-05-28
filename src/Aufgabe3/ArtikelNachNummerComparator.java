package Aufgabe3;

import java.util.Comparator;

public class ArtikelNachNummerComparator implements Comparator <Artikel> {

	@Override
	public int compare(Artikel o1, Artikel o2) {
	
		int n1 = o1.getNr();
		int n2 = o2.getNr();
		if (n1>n2) return 1;
		if (n1<n2) return -1;
		else return 0;
	}

}
