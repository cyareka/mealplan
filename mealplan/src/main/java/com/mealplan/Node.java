package com.mealplan;
public class Node {

    private String meal;
    private String day;
    private String time;

    Node left;
    Node right;
    int height;
    
    // Default constructor to create null node
    Node() {
        meal = "";
        day = "";
        time = "";
        left = null;
        right = null;
        height = 0;
    }

    // Parameterized constructor
    Node(String strMeal, String strDay, String strTime) {
        meal = strMeal;
        day = strDay;
        time = strTime;
        left = null;
        right = null;
        height = 0;
    }    
}
