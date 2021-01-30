package pl.sda.zadania.list.zad4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @Author amen
 * @Created 30.01.2021 10:17
 * @Project zadania_zdalne_pl_70
 */
public class MainProwadzacy {
    /**
     * Stwórz oddzielnego maina, a w nim kolejną listę String'ów. Wykonaj zadania:
     * - dodaj do listy losowe 100 elementów z zakresu 0-100. (​konwersja int na string toString.valueOf())
     * - oblicz średnią liczb
     * - usuń wszystkie liczby powyżej średniej
     * - wypisz wszystkie liczby
     * - wykonaj kopię listy do tablicy
     */
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Random generator = new Random();

        for (int i = 0; i < 100; i++) {
            // wygenerowanie liczby
            int wygenerowanaLiczba = generator.nextInt(100);

            // zamiana String -> tekst
            String tekstowoLiczba = String.valueOf(wygenerowanaLiczba);

            strings.add(tekstowoLiczba);
        }

        // skompletowana lista 100 x String (liczba w postaci tekstu)
        double suma = 0;
        for (String tekstowaWartość : strings) {
            // przetworzenie z tekstu na liczbę
            int liczba = Integer.parseInt(tekstowaWartość);

            // (tutaj inna 'precyzja' liczby dla porównania dla Was) zamiana liczby (String/tekst) na double
//            double wartość = Double.parseDouble(tekstowaWartość);
            suma += liczba;
        }

        // obliczenie wartości wykona się z precyzją najbardziej precyzyjnej składowej
        double średnia = suma / strings.size();
        System.out.println("Wartośco: " + strings);
        System.out.println("Średnia: " + średnia);

//        Może wystąpić: Exception in thread "main" java.util.ConcurrentModificationException
//        for (String wartosc : strings) {
//            // przetworzenie z tekstu na liczbę
//            int liczba = Integer.parseInt(wartosc);
//
//            // jeśli wartość jest wyższa od średniej
//            if(liczba > średnia){
//                // usuń tą wartość z listy
//                strings.remove(liczba);
//            }
//        }

        // Opcja 1.
//        String[] kopia = strings.toArray(new String[strings.size()]);
////        List<String> kopia = new ArrayList<>(strings);
////        Set<String> kopia = new HashSet<>(strings);
//        for (String wartosc : kopia) {
//            // przetworzenie z tekstu na liczbę
//            int liczba = Integer.parseInt(wartosc);
//
//            // jeśli wartość jest wyższa od średniej
//            if (liczba > średnia) {
//                // usuń tą wartość z listy
//                strings.remove(wartosc);
//            }
//        }

        // Opcja 2.
        // Collection
        Iterator<String> it = strings.iterator();
        while (it.hasNext()) {

            String zwróconaWartosc = it.next();
            // przetworzenie z tekstu na liczbę
            int liczba = Integer.parseInt(zwróconaWartosc);

//            Bardzo dużym błędem jest wykonywanie 2 x instrukcję next wewnątrz jednego obiegu

            if(liczba > średnia){
//                usuwamy
                it.remove();
            }
        }
//
//        1
//        2
//        3
//        4
//        5
//        6
        System.out.println(strings);
    }
}
