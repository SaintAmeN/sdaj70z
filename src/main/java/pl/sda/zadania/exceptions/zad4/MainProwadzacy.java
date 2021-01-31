package pl.sda.zadania.exceptions.zad4;

import pl.sda.zadania.exceptions.zad4.prowadzacy.Walidator;
import pl.sda.zadania.exceptions.zad4.prowadzacy.WalidatorPrzeszlosci;
import pl.sda.zadania.exceptions.zad4.prowadzacy.WalidatorPrzyszlosci;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static pl.sda.zadania.exceptions.zad4.prowadzacy.Walidator.FORMAT_DATY;

/**
 * @Author amen
 * @Created 30.01.2021 14:15
 * @Project zadania_zdalne_pl_70
 */
public class MainProwadzacy {
    /**
     * Stwórz aplikację i w niej załaduj od użytkownika datę i czas w przyszłości.
     * <p>
     * Stwórz interfejs "Walidator" z metodą:
     * boolean sprawdź(String data);
     * <p>
     * Stwórz klasę WalidatorPrzyszlosci który implementuje Walidator. Waliduje, czy podana data jest w przyszłości,
     * jeśli nie, rzuca WyjątekCzasoprzestrzeni(komunikat).
     * Stwórz klasę WalidatorPrzeszlosci który implementuje Walidator. Waliduje, czy podana data jest w przeszłości,
     * jeśli nie, rzuca WyjątekCzasoprzestrzeni(komunikat).
     * <p>
     * Jeśli data jest w poprawnym formacie i w przyszłości/przeszłości (poprawnie) to zwracamy true.
     * Jeśli data jest w złym formacie zwracamy false.
     * <p>
     * <p>
     * * Jeśli użytkowonik wpisze datę/czas w złym formacie lub w przeszłości każ mu powtórzyć czynność (użyj pętli).
     * <p>
     * Po poprawnym wpisaniu daty oblicz ile czasu(w minutach) zostało do tamtej daty i wypisz na ekran.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Walidator walidator = null;
        do {
            String rodzaj = pobierzTekstOdUzytkownika("Podaj rodzaj walidatora (0 - przeszłość, 1 - przyszłość: ", scanner);
            switch (rodzaj) {
                case "0":
                    walidator = new WalidatorPrzeszlosci();
                    break;
                case "1":
                    walidator = new WalidatorPrzyszlosci();
                    break;
                default:
                    walidator = null;
            }
        } while (walidator == null);


        String data = null;
        Boolean wynik = null; // null oznacza że metoda nie wykonała się poprawnie.
        do {
            data = pobierzTekstOdUzytkownika("Podaj datę w formacie (" + FORMAT_DATY + "):", scanner);

            try {
                wynik = walidator.sprawdź(data);
            } catch (DateTimeParseException dtpe) {
                wynik = null;
            }


        } while (wynik == null);

        System.out.println("Opuszczam pętle, wynik:" + wynik);

        Period p = Period.between(LocalDate.now(), LocalDate.parse(data, Walidator.FORMATTER));
        System.out.println("Różnica w minutach: " + calculateMinutes(p));
    }

    private static int calculateMinutes(Period p) {
        //      3 lata               +  2 miesiące        +         2 dni
        //      3 *525600            +  2 * 1440          +         2 * 43200 = 1666080
        return (p.getYears()*525600) + (p.getDays()*1440) + (p.getDays()*43200);
    }

    private static String pobierzTekstOdUzytkownika(String pytanie, Scanner scanner) {
        String wartosc;
        do {
            try {
                System.out.println(pytanie);
                wartosc = scanner.next();
            } catch (InputMismatchException ime) {
                String token = scanner.next();

                System.out.println("Niepoprawne wejście.");
                wartosc = null;
            }
        } while (wartosc == null);

        return wartosc;
    }
}
