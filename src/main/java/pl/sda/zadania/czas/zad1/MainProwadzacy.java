package pl.sda.zadania.czas.zad1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @Author amen
 * @Created 24.01.2021 11:31
 * @Project zadania_zdalne_pl_70
 */
public class MainProwadzacy {
    //    1.Napisz aplikację, która wyświetli datę (wpisaną ze scannera) sprzed 10 dni i datę zadziesięć dni.
    //    Wskazówka: skorzystaj z metody plusDays() na obiekcie LocalDate.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj datę w formacie: MM/dd/yyyy");
        String dataTekst = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy -> MM <- dd");

        LocalDate data = LocalDate.parse(dataTekst, formatter);

        System.out.println("Data - 10 wcześniej to: " + data.minusDays(10) + " 10 dni później: " + data.plusDays(10));
        System.out.println("Data - 10 wcześniej to: " + data.minusDays(10).format(format2) + " 10 dni później: " + data.plusDays(10).format(format2));
    }
}
