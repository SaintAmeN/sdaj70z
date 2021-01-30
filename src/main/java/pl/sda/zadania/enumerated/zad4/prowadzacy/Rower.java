package pl.sda.zadania.enumerated.zad4.prowadzacy;

/**
 * @Author amen
 * @Created 30.01.2021 11:24
 * @Project zadania_zdalne_pl_70
 */
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
}
