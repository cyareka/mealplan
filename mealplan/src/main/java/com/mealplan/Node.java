package com.mealplan;
public class Node {

    private String meal;
    public String day;
    private String time;

    public Node left;
    public Node right;
    public int height;
    
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
