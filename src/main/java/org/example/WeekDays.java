package org.example;

public enum WeekDays {

    MONDAY("Monday", false),
    TUESDAY("Tuesday", false),
    WEDNESDAY("Wednesday", false),
    THURSDA("Thursday", false),
    FRIDAY("Friday", false),
    SATURDAY("Saturday", true),
    SUNDAY("Sunday", true);

    private final String value;
    private final boolean favoriteDay;




    private String weekday;
    WeekDays(String value, boolean isWeekend) {
        this.value = value;
        this.favoriteDay = isWeekend;
    }

public String getValue() {
        return value;
}
public boolean isFavoriteDay() {
        return favoriteDay;
}

public boolean isWeekend() {
        return true;
    }









}



