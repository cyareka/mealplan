package com.mealplan;

// INSERT (x), DELETE, DISPLAY, NEW WEEK, FIND (x)

import java.util.*;
public class HashTable {

    private Hashtable<Integer, Meal> mealPlan;
    private int SIZE = 30;

    public HashTable() {
        mealPlan = new Hashtable<Integer, Meal>();
    }   

    public void insert(int num, String meal, String day, String time) {
        Meal m = new Meal(num, meal, day, time);
        mealPlan.put(num, m);
    }

    public Meal find(int num) {
        return (Meal) mealPlan.get(num);
    }

    public Meal delete(int num) {
        return (Meal) mealPlan.remove(num);
    }

    public String display() {
        return mealPlan.toString();
    }

    public Week() {
        days = new Hashtable<String, ArrayList<String>>();
  }
    public void newWeek(String meal, String day, String time) {
        ArrayList<String> week = days.get(day);
        Week week = new Week();

        if (week == null) {
        week = new ArrayList<String>();
        days.put(day, week);
    }
        newWeek.add(week);
  }

}

