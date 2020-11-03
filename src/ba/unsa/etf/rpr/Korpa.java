package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    protected int brojArtikala=0;


    public boolean dodajArtikl(Artikl x){
        if(brojArtikala>49) {
            return false;
        }
        artikli[brojArtikala++] = new Artikl(x.getNaziv(),x.getCijena(),x.getKod());
        return true;
    }
    public Artikl[] getArtikli() {
        return artikli;
    }
    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i = 0; i < brojArtikala; i++)
            if (artikli[i].getKod().equals(kod)) {
                Artikl temp = new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                for (int k = i; k < brojArtikala; k++) {
                    artikli[k] = artikli[k + 1];
                }
                brojArtikala--;
                return temp;
            }
        return null;
    }
    public int dajUkupnuCijenuArtikala(){
        int cijena=0;
        for(int i=0;i<brojArtikala;i++){
            cijena = cijena + artikli[i].getCijena();
        }
        return cijena;
    }

}
