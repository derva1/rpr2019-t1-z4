package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    private Korpa korpa;
    private Artikl artikl;

    @Test
    void testDodavanjaUKorpu() {
        korpa = new Korpa();
        artikl = new Artikl("Sok", 10, "2233" );
        boolean uspjesnoDodavanje;
        uspjesnoDodavanje = korpa.dodajArtikl(artikl);
        assertTrue(uspjesnoDodavanje);
    }

    @Test
    void testDodavanjaUPunuKorpu() {
        korpa = new Korpa();
        for(int i=0;i<50;i++){
            Artikl artikl = new Artikl("Sok",10,String.valueOf(i));
            korpa.dodajArtikl(artikl);
        }
        boolean uspjesnoDodavanje = korpa.dodajArtikl(new Artikl("Čokolada",5,"3333"));
        assertFalse(uspjesnoDodavanje);
    }

    @Test
    void testIzbacivanjaArtikla() {
        korpa = new Korpa();
        artikl = new Artikl("Sok", 10, "2233" );
        korpa.dodajArtikl(artikl);
        Artikl izbaceni = korpa.izbaciArtiklSaKodom("2233");
        assertEquals(artikl.getKod(),izbaceni.getKod());

    }

    @Test
    void testUkupnaCijenaArtikala() {
        korpa = new Korpa();
        int ukupna = 0;
        for(int i=0;i<5;i++){
            artikl = new Artikl("Čips",3,String.valueOf(i));
            korpa.dodajArtikl(artikl);

            ukupna = ukupna + artikl.getCijena();
        }

        assertEquals(15,ukupna);
    }

    @Test
    void testBrojaArtikala(){
        korpa = new Korpa();
        artikl = new Artikl("Sladoled",3,"33");
        korpa.dodajArtikl(artikl);
        assertEquals(1,korpa.brojArtikala);
    }
}