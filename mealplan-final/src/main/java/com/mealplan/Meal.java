package com.mealplan;

public class Meal {
    private int number;
    private String meal;
    private String day;
    private String time;  
    
    // Default constructor to create null node
    public Meal() {
        meal = "";
        day = "";
        time = "";
    }
     
    // Parameterized constructor
    public Meal(final int intNum, final String strMeal, final String strDay, final String strTime) {
        number = intNum;
        meal = strMeal;
        day = strDay;
        time = strTime;
    }

    public int getNumber() {
        return number;
    }

    public String getMeal() {
        return meal;
    }
    
    public String getDay() {
        return day;
    }
    
    public String getTime() {
        return time;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean equals(Meal m1) {
        Meal m2 = (Meal) m1;
        return m2.number == this.number;
    }

    @Override
    public String toString() {
        return "No.: " + number + " | Meal: " + meal + " | Day: " + day + " | Time: " + time; 
    }    
}
