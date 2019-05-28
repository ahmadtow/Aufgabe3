package Aufgabe3;

public class Artikel {
  
	private int nr;
    private String bezeichnung;
    private double preis;
	private static Datum imSortimentSeit;
    private Datum aufnahmeInPortfolio;				 
    private Datum letztmaligerVerkauf;
    private Datum letzteAktualisierung;
    static private int anzahl = 0;
   

    public Artikel(int nr, String bezeichnung, double preis) {
        this.nr = nr;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        
        imSortimentSeit = new Datum();
        anzahl++;
    }
    
    public Artikel(int nr, String bezeichnung, double preis, Datum imSortimentSeit) {
        this.nr = nr;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        Artikel.imSortimentSeit = imSortimentSeit;
        anzahl++;
    }
    
    public int getNr() {
 		return nr;
 	}

 	public void setNr(int nr) {
 		this.nr = nr;
 	}

    public static int getAnzahl() {
        return anzahl;
    }
    public  Datum getDate() {
		return imSortimentSeit;
       
    }
    
    

    public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public static Datum getImSortimentSeit() {
		return imSortimentSeit;
	}

	public static void setImSortimentSeit(Datum imSortimentSeit) {
		Artikel.imSortimentSeit = imSortimentSeit;
	}

	public Datum getAufnahmeInPortfolio() {
		return aufnahmeInPortfolio;
	}

	public void setAufnahmeInPortfolio(Datum aufnahmeInPortfolio) {
		this.aufnahmeInPortfolio = aufnahmeInPortfolio;
	}

	@Override
	public String toString() {
		return "Artikel [nr=" + nr + ", bezeichnung=" + bezeichnung + ", preis=" + preis + ", aufnahmeInPortfolio="
				+ aufnahmeInPortfolio + ", letztmaligerVerkauf=" + letztmaligerVerkauf + ", letzteAktualisierung="
				+ letzteAktualisierung + ", getNr()=" + getNr() + ", getBezeichnung()=" + getBezeichnung()
				+ ", getPreis()=" + getPreis() + ", getAufnahmeInPortfolio()=" + getAufnahmeInPortfolio()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public void print(){
        System.out.println("Artikelnummer:\t\t"+nr+"\t");
        System.out.println("Bezeichnung:\t\t"+bezeichnung+"\t");
        System.out.println("Verkaufspreis:\t\t"+preis+"\t");
        System.out.print("Im Sortiment seit:\t");
       
        imSortimentSeit.print();
        System.out.println();
        System.out.println("aufnahmeInPortfolio:\t\t"+aufnahmeInPortfolio+"\t");
        System.out.println("letztmaligerVerkauf:\t\t"+letztmaligerVerkauf+"\t");
        System.out.println("letzteAktualisierung:\t\t"+letzteAktualisierung+"\t");
    }
    
}
