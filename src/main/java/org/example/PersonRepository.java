package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {

    List<Person> people =  List.of(new Person("3","C", WeekDays.SUNDAY));

public Optional<Person> getPersonNameById(String id) {
    for (Person b: people) {
        if (b.id().equals(id)) {
            return Optional.of(b);
        }
    }
    return Optional.empty();

}



}
