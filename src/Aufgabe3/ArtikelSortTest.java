package Aufgabe3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArtikelSortTest {

	public static void main(String[] args) {

		ArrayList<Artikel> liste = new ArrayList<Artikel>();

		liste.add(new Artikel(10, "Hut",   20.99, new Datum(17, 5, 1989)));
		liste.add(new Artikel(2, "Socken", 15.29, new Datum(22, 1, 2005)));
		liste.add(new Artikel(7, "Schuhe", 89.29, new Datum(28, 3, 1989)));

		listeAusgeben(liste);
		System.out.println("-------------Nummer");
		Collections.sort(liste, new ArtikelNachNummerComparator());
		listeAusgeben(liste);
		System.out.println("-------------Bezeichner");
		Collections.sort(liste, new ArtikelNachBezComparator());
		listeAusgeben(liste);
		System.out.println("-------------Preis");
		Collections.sort(liste, new ArtikelNachPreisComparator());
		listeAusgeben(liste);
		System.out.println("-------------Erstellung");
		Collections.sort(liste, new ArtikelNachErstellungComparator());
		listeAusgeben(liste);

	}

	public static void listeAusgeben(Collection<Artikel> liste) {
		Iterator<Artikel> it = liste.iterator();
		while (it.hasNext()) {
			((Artikel) it.next()).print();
		}
	}

}
