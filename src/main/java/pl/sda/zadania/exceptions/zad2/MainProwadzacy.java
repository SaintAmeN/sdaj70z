package pl.sda.zadania.exceptions.zad2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author amen
 * @Created 30.01.2021 12:48
 * @Project zadania_zdalne_pl_70
 */
public class MainProwadzacy {

    /**
     * Napisz program, a w nim metodę która pyta użytkownika o dwie liczby a następnie sprawdza czy druga liczba nie jest ==0.
     * Pytanie i scanner (pobranie danych) zawrzyj w Main, instrukcja ma wykonywać sprawdzenia i rzucenie exception.
     * Przechwycenie ma nastąpić w main.
     * <p>
     * Jeśli jest, to wyrzuca wyjątek ‘CholeroException’ z komunikatem
     * “Pamiętaj cholero, by nie dzielić przez zero!”.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer a = pytajUzytkownikaDoBolu("Podaj pierwszą liczbę całkowitą: ", scanner);
        Integer b = pytajUzytkownikaDoBolu("Podaj drugą liczbę całkowitą: ", scanner);

//        ...
//        extracted(a,b);
    }

    private static int pytajUzytkownikaDoBolu(String pytanie, Scanner scanner) {
        Integer wartosc;

        // for odpada - nie jest to instrukcja 'ileś razy'
        // do while   - wykona się przynajmniej raz
        // while-do

        do {
            try {
                System.out.println(pytanie);
                wartosc = scanner.nextInt();
            } catch (InputMismatchException ime) {
                // nie otrzymaliśmy poprawnego wejścia.

                // nie pasuje nam to co wpisał, więc to przeskakujemy i ignorujemy
                String token = scanner.next();

                System.out.println("Niepoprawne wejście.");
                wartosc = null;
            }
        } while (wartosc == null);

        return wartosc;
    }
}
