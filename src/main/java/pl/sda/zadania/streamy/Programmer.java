package pl.sda.zadania.streamy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author amen
 * @Created 13.02.2021 11:04
 * @Project zadania_zdalne_pl_70
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Programmer {
    private Person person;
    private List<String> languages;
}
