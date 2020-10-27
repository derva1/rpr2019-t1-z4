package ba.unsa.etf.rpr;

public class Artikl {
    String ime;
    int cijena;
    String kod;
    public Artikl(String ime,int cijena,String kod){
        this.ime=ime ; this.cijena=cijena; this.kod=kod;
    }

    public String getIme() {
        return ime;
    }

    public int getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }
}
