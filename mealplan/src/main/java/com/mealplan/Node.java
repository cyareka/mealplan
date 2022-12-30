package com.mealplan;

enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

enum TimeOfDay {
    MORNING,
    AFTERNOON,
    EVENING
}

public class Node {

    private String meal;
    private String day;
    private String time;
    
    Node() {
        meal = "";
        day = "";
        time = "";
    }
    
    Node(String strMeal, String strDay, String strTime) {
        meal = strMeal;
        day = strDay;
        time = strTime;
    }

    public void setData(String meal, String day, String time) {
        this.meal = meal;
        this.day = day;
        this.time = time;
    }

    
    
}
