package pl.sda.zadania.list.zad5;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author amen
 * @Created 24.01.2021 13:07
 * @Project zadania_zdalne_pl_70
 */
public class MainProwadzacy {
    /**
     * ​Stwórz klasę Student która posiada pola:
     * - nr indeksu                (String nrIndeksu)
     * - imie                      (String imie)
     * - nazwisko                  (String nazwisko)
     * - płeć (wartość enum)       (Płeć plec)
     * <p>
     * public static enum Płeć{ MEZCZYZNA, KOBIETA; }
     * <p>
     * W mainie stwórz instancję kolekcji typu ArrayList, która zawiera obiekty klasy Student.
     * Dodaj do kolekcji kilku studentów (dodaj je ręcznie - wpisz cokolwiek).
     * a. Spróbuj wypisać elementy listy stosując zwykłego "sout'a"
     * b. Spróbuj wypisać elementy stosując pętlę foreach
     * c. Wypisz tylko kobiety
     * d. Wypisz tylko mężczyzne.
     * <p>
     * Wypisz tylko indeksy osób
     */
    public static void main(String[] args) {
        Płeć oNazwieCostam = Płeć.KOBIETA;
        // new Student("123", "Pawel", "Gawel", Płeć.MEZCYZNA) // ==

        List<Student> listaStudentow = new ArrayList<>();

        Student student1 = new Student("123", "Pawel", "Gawel", Płeć.MEZCZYZNA);
        listaStudentow.add(student1);
        listaStudentow.add(new Student("12331", "Marek", "Kowalski", Płeć.MEZCZYZNA));
        listaStudentow.add(new Student("12332", "Ala", "Kowalski", Płeć.KOBIETA));
        listaStudentow.add(new Student("12333", "Franek", "Kowalski", Płeć.MEZCZYZNA));
        listaStudentow.add(new Student("12334", "Janek", "Nowak", Płeć.MEZCZYZNA));
        listaStudentow.add(new Student("12335", "Ola", "Nowak", Płeć.KOBIETA));
        listaStudentow.add(new Student("12336", "Dzbanek", "Nowak", Płeć.MEZCZYZNA));
        listaStudentow.add(new Student("12337", "Jola", "Nowak", Płeć.KOBIETA));
        listaStudentow.add(new Student("12338", "Basia", "Kowalski", Płeć.KOBIETA));

        System.out.println(listaStudentow);

        System.out.println("Lista wszystkich linia pod linią:");
        for (Student student : listaStudentow) {
            System.out.println(student);
        }

        System.out.println("Lista kobiet linia pod linią:");
        for (Student student : listaStudentow) {
            if (student.getPłeć() == Płeć.KOBIETA) {
                System.out.println(student);
            }
        }


        System.out.println("Lista mężczyzn linia pod linią:");
        //


        System.out.println("Lista indeksów linia pod linią:");
        for (Student student : listaStudentow) {
            System.out.println(student.getNrIndeksu());
        }
    }
}
