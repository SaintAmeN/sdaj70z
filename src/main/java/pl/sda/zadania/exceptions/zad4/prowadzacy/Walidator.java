package pl.sda.zadania.exceptions.zad4.prowadzacy;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * @Author amen
 * @Created 31.01.2021 10:57
 * @Project zadania_zdalne_pl_70
 */
public interface Walidator {
    public static final String FORMAT_DATY = "yyyy/MM.dd";
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(FORMAT_DATY);

    boolean sprawdź(String data) throws DateTimeParseException;
}
