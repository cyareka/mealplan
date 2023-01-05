package com.mealplan;

// INSERT (x), DELETE, DISPLAY, NEW WEEK, FIND (x)

import java.util.Hashtable;
public class HashTable {

    private Hashtable<Integer, Meal> mealPlan;
    private static final int SIZE = 21;

    public HashTable() {
        mealPlan = new Hashtable<Integer, Meal>();
    }  
    
    public HashTable(int size) {
        size = SIZE;
        mealPlan = new Hashtable<Integer, Meal>(size);
    }

    
    public void insert(int num, String meal, String day, String time) {
        Meal m = new Meal(num, meal, day, time);
            mealPlan.put(num, m);
        }
    }

    public Meal find(int num) {
        return (Meal) mealPlan.get(num);
    }
    
    public void delete(int num) {
        mealPlan.remove(num);
    }

    public String display() {
        return mealPlan.toString();
    }

    public void newWeek() {
        mealPlan.clear();
        display();
    }
}

