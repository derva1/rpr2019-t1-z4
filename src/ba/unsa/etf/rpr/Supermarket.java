package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl[] artikli = new Artikl[1000];
    int brojArtikala=0;

    public boolean dodajArtikl(Artikl x){
        if(brojArtikala>49) return false;
        artikli[brojArtikala++] = new Artikl(x.getNaziv(),x.getCijena(),x.getKod());
        return true;
    }
    public Artikl[] getArtikli() {
        return artikli;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        for(int i=0;i<brojArtikala;i++){
            if(artikli[i].getKod().equals(kod)){
                if (brojArtikala - i >= 0) System.arraycopy(artikli, i + 1, artikli, i, brojArtikala - i);
                brojArtikala--;
                return new Artikl(artikli[i].getNaziv(),artikli[i].getCijena(),artikli[i].getKod());
            }
        }
        return null;
    }

}
