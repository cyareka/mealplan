package com.mealplan;
public class Node {

    private String meal;
    public String day;
    private String time;
    
    public Node left;
    public Node right;    
    
    // Default constructor to create null node
    Node() {
        meal = "";
        day = "";
        time = "";
        left = null;
        right = null;
    }
    
    // Parameterized constructor
    Node(String strMeal, String strDay, String strTime) {
        meal = strMeal;
        day = strDay;
        time = strTime;
        left = null;
        right = null;
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
    
    public Node getLeft() {
        return left;
    }
    
    public Node getRight() {
        return right;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String toString() {
        return "Meal: " + meal + " Day: " + day + " Time: " + time + "\n"; 
    }    
}
