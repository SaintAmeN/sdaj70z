package pl.sda.zadania.streamy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author amen
 * @Created 13.02.2021 11:03
 * @Project zadania_zdalne_pl_70
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean male;
}
