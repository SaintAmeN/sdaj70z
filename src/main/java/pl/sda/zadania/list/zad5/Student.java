package pl.sda.zadania.list.zad5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author amen
 * @Created 24.01.2021 13:19
 * @Project zadania_zdalne_pl_70
 */
@Getter
@Setter
@ToString
public class Student {
    private String nrIndeksu;
    private String imie;
    private String nazwisko;
    private Płeć plec;

    public Student(String nrIndeksu, String imie, String nazwisko, Płeć plec) {
        this.nrIndeksu = nrIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }
}
