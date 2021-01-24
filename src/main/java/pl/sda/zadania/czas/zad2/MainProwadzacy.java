package pl.sda.zadania.czas.zad2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @Author amen
 * @Created 24.01.2021 11:31
 * @Project zadania_zdalne_pl_70
 */
public class MainProwadzacy {
    // Napisz aplikację, która wyświetli "różnicę" dwóch dat w formacie: "years: , months: ,days: "
    // Wskazówka: skorzystaj z klasy Period:Period period = Period.between(data_start, data_stop);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        System.out.println("Wpisz datę w domyślnym formacie (yyyy/MM/dd):");
        String date1String = scanner.nextLine();
        LocalDate date1 = LocalDate.parse(date1String, formatter);

        System.out.println("Wpisz datę w domyślnym formacie (yyyy/MM/dd):");
        String date2String = scanner.nextLine();
        LocalDate date2 = LocalDate.parse(date2String, formatter);

//        System.out.println("Wpisz datę w domyślnym formacie (yyyy-MM-dd):");
//        String date1String = scanner.nextLine();
//        LocalDate date1 = LocalDate.parse(date1String);
//
//        System.out.println("Wpisz datę w domyślnym formacie (yyyy-MM-dd):");
//        String date2String = scanner.nextLine();
//        LocalDate date2 = LocalDate.parse(date2String);

        Period p = Period.between(date1, date2);
        System.out.println("Years: " + p.getYears() + " Months: " + p.getMonths() + " Days: " + p.getDays());
    }
}
