package pl.sda.zadania.set.zad1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author amen
 * @Created 23.01.2021 11:54
 * @Project zadania_zdalne_pl_79
 */
public class Main {
    public static void main(String[] args) {
        Long[] tablica = new Long[]{10L, 12L, 10L, 3L, 4L, 12L, 12L, 300L, 12L, 40L, 55L};
//        Set<Long> liczby = new HashSet<>(Arrays.asList(tablica));
        Set<Long> liczby = new TreeSet<>(); // sortuje
        liczby.addAll(Arrays.asList(tablica));

        System.out.println("Liczba elementów: " + liczby.size());

        for (Long integer : liczby) {
            System.out.println(integer);
        }

        liczby.remove(10L);
        liczby.remove(12L);
//        liczby.remove("UK z unii");

        System.out.println("Liczba elementów: " + liczby.size() + " zawartość: " + liczby);

    }
}
