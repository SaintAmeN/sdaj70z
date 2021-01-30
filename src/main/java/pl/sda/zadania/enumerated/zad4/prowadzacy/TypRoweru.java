package pl.sda.zadania.enumerated.zad4.prowadzacy;

/**
 * @Author amen
 * @Created 30.01.2021 11:25
 * @Project zadania_zdalne_pl_70
 */
public enum TypRoweru {
    ROWER(1),      //- instancja 1
    TANDEM(2);     //- instancja 2

    private int iloscMiejsc;

    // wygenerowany konstruktor
    TypRoweru(int iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }

    public int getIloscMiejsc() {
        return iloscMiejsc;
    }
}
