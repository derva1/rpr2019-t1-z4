package ba.unsa.etf.rpr;

public class Artikl {
    String naziv;
    int cijena;
    String kod;
    public Artikl(String ime,int cijena,String kod){
        this.naziv=ime ; this.cijena=cijena; this.kod=kod;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }
}
