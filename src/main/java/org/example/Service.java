package org.example;

public class Service {

    private final PersonRepository personRepository;



    public Service() {
        personRepository = new PersonRepository();

    }

    public String getPersonNameById(String id) {
        Person b = personRepository.getPersonNameById(id).orElse(new Person("9","Jery",WeekDays.MONDAY));
        return b.name();
   }
}
