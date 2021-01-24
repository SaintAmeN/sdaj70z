package pl.sda.zadania.list.zad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author amen
 * @Created 24.01.2021 09:19
 * @Project zadania_zdalne_pl_70
 */
public class MainProwadzacy {
    /**
     * Stwórz listę Integerów. Wykonaj zadania:
     * - dodaj do listy 5 elementów ze scannera
     * - dodaj do listy 5 elementów losowych
     * - wypisz elementySprawdź działanie aplikacji.
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();

        List<Integer> integerList = new ArrayList<>();

        // wczytanie od użytkownika:
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj liczbę: ");
            int liczba = scanner.nextInt();

            integerList.add(liczba);
        }
        System.out.println("Lista zawiera: " + integerList);

        // generowanie
        for (int i = 0; i < 5; i++) {
            int liczba = generator.nextInt(100); // 0-99

            integerList.add(liczba);
        }
        System.out.println("Lista zawiera: " + integerList);
    }
}
