package pl.sda.zadania.exceptions.zad4.prowadzacy;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 * @Author amen
 * @Created 31.01.2021 10:57
 * @Project zadania_zdalne_pl_70
 */
public class WalidatorPrzeszlosci implements Walidator {
    /**
     * Metoda zwraca true jeśli:
     *      - format daty (w stringu) jest poprawny
     *      - data jest w przeszłości.
     * Jeśli którekolwiek z wymagań jest niepoprawne, zwracamy false.
     *
     * @param data - string w formacie {@code Walidator.FORMAT_DATY}
     * @return wynik - true jeśli data jest poprawna i w dobrym formacie.
     */
    @Override
    public boolean sprawdź(String data) throws DateTimeParseException {
        LocalDate date = null;
        try {
            date = LocalDate.parse(data, FORMATTER);
        } catch (DateTimeParseException dtpe) {
            // jeśli złapaliśmy ten błąd...
            System.err.println("Data w błędnym formacie!");
            throw dtpe; // złap wyjątek, dopisz komunikat i rzuć go dalej w górę
        }

        return date.isBefore(LocalDate.now());
    }
}
