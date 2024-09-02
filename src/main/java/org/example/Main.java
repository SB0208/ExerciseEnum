package org.example;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("1","A", WeekDays.FRIDAY);
        Person person2 = new Person("2","B",WeekDays.MONDAY);
        System.out.println(person);
        System.out.println(person2);


        Service service = new Service();

        System.out.println(service.getPersonNameById("1"));
        System.out.println(service.getPersonNameById("2"));

    }

    public static void checkDay(WeekDays day){
        if (day.isWeekend()){
            System.out.println("Finaly Weekend");

        }
        else {
            System.out.println("Work");
        }
    }
}

