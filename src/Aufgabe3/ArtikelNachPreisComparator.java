package Aufgabe3;

import java.util.Comparator;

public class ArtikelNachPreisComparator implements Comparator <Artikel>{

	@Override
	public int compare(Artikel o1, Artikel o2) {
		double pr1 =  o1.getPreis();
		double pr2 =  o1.getPreis();
		   return (int) (pr1-pr2);

	}

}
