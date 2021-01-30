package pl.sda.zadania.exceptions.zad1;

import pl.sda.zadania.exceptions.zad2.CholeroProwadzacyException;

/**
 * @Author amen
 * @Created 30.01.2021 12:48
 * @Project zadania_zdalne_pl_70
 */
public class Main {
    /**
     * Napisz program, który prosi użytkownika o dwie liczby(całkowite) a i b,
     * i wyświetla wynik dzielenia a/b. Jeżeli b jest ujemne program powinien wyświetlić odpowiedni komunikat.
     * (Dwie metody [przyjmujemy dwa argumenty])
     * Wariant 1: Zastosuj instrukcję if            (zamiast exception wyświetlamy komunikat)
     * Wariant 2: Zastosuj instrukcję try-catch     (wywołujemy metodę i przechwycenie odbywa się w main)
     */
    public static void main(String[] args) {
        throw new CholeroProwadzacyException();
    }
}
