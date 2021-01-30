package pl.sda.zadania.list.zad3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author amen
 * @Created 30.01.2021 13:05
 * @Project zadania_zdalne_pl_70
 */
public class MainProwadzacy {
    /**
     * Stwórz oddzielnego maina, a w nim kolejną listę ​String'ów​.
     * Wykonaj zadania:
     * - dodaj do listy elementy:
     *      10030, 3004, 4000, 12355, 12222, 67888, 111200, 225355,2222, 1111, 3546, 138751, 235912
     *          (jako stringi)
     *          (dodaj je posługując się metodąArrays.asList())
     *
     * Przykład użycia Arrays.asList():
     *
     *      ArrayList<Integer> liczby = new ArrayList<>(Arrays.asList(23, 32, 44, 55, 677, 11, 33));
     *
     * Podany przykład to tylko demonstracja metody Arrays.asList, zadanie należy wykonać na liście String’ów!
     *
     * Kolejne polecenia:
     * - określ indeks elementu 138751 posługując się metodą indexOf
     * - sprawdź czy istnieje na liście obiekt 67888 metodą contains (wynik wypisz na ekran)
     * - sprawdź czy istnieje na liście obiekkt 67889 metodą contains (wynik wypisz na ekran)
     * - usuń z listy obiekt 67888 oraz 67889 (metoda remove)
     * - wykonaj ponownie powyższe sprawdzenia.
     *     - iteruj całą listę, wypisz elementy na ekran (a. w jednej linii, b. każdy element woddzielnej linii).Sprawdź działanie aplikacji
     */
    public static void main(String[] args) {
//        For You to play:

//        List<String> dziala = new ArrayList<>(Arrays.asList("10030", "3004", "4000", "12355", "12222", "67888", "111200", "225355,2222", "1111", "3546", "138751", "235912"));
//        dziala.add("5");
//        dziala.add("15");
//        dziala.add("15");
//        System.out.println(dziala);

//        List<String> nieDziala = Arrays.asList("10030", "3004", "4000", "12355", "12222", "67888", "111200", "225355,2222", "1111", "3546", "138751", "235912");
//        nieDziala.add("5");
//        nieDziala.add("15");
//        nieDziala.add("15");
//        System.out.println(nieDziala);

//        Rozwiązanie:
        List<String> stringList = new ArrayList<>(Arrays.asList("10030", "3004", "4000", "12355", "12222", "67888", "111200", "225355,2222", "1111", "3546", "138751", "235912"));

//        - określ indeks elementu 138751 posługując się metodą indexOf
//      indexOf jest instrukcją która zwraca indeks pierwszego wystąpienia danego elementu, lub -1 jeśli go nie znaleziono.

        int nieZnalziono = stringList.indexOf(138751);     // < - dlaczego to nie działa
        System.out.println("Pierwsze sprawdzenie indexof: " + nieZnalziono);

        int znaleziono = stringList.indexOf("138751");   // < - a to działa
        System.out.println("Drugie sprawdzenie indexof: " + znaleziono);

    }
}
