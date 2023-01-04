package com.mealplan;
public class Meal {

    private int number;
    private String meal;
    public String day;
    private String time;  
    
    // Default constructor to create null node
    Meal() {
        number = 0;
        meal = "";
        day = "";
        time = "";
    }
    
    // Parameterized constructor
    Meal(int intNum, String strMeal, String strDay, String strTime) {
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

    @Override
    public String toString() {
        return "\n No.: " + number + " | Meal: " + meal + " | Day: " + day + " | Time: " + time; 
    }    
}
