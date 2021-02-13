package pl.sda.zadania.enumerated.zad4.prowadzacy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author amen
 * @Created 30.01.2021 11:24
 * @Project zadania_zdalne_pl_70
 */

@NoArgsConstructor
public class Rower {
    private int iloscPrzerzutek;
    private TypRoweru typRoweru;
    private String nazwaRoweru;

    public Rower(int iloscPrzerzutek, TypRoweru typRoweru, String nazwaRoweru) {
        this.iloscPrzerzutek = iloscPrzerzutek;
        this.typRoweru = typRoweru;
        this.nazwaRoweru = nazwaRoweru;
    }

    public void wypiszInformacjeORowerze(){
        System.out.println("To jest rower: " + nazwaRoweru +
                " ilość przerzutek w rowerze: " + iloscPrzerzutek +
                " typ roweru: " + typRoweru +
                " ilość miejsc: " + typRoweru.getIloscMiejsc());
    }

    public int getIloscPrzerzutek() {
        return iloscPrzerzutek;
    }

    public void setIloscPrzerzutek(int iloscPrzerzutek) {
        this.iloscPrzerzutek = iloscPrzerzutek;
    }

    public TypRoweru getTypRoweru() {
        return typRoweru;
    }

    public void setTypRoweru(TypRoweru typRoweru) {
        this.typRoweru = typRoweru;
    }

    /**
     * Zwraca nazwę lub null.
     * @return nazwa lub null
     */
    public String getNazwaRoweru() {
        return nazwaRoweru;
    }

    public void setNazwaRoweru(String nazwaRoweru) {
        this.nazwaRoweru = nazwaRoweru;
    }
}
