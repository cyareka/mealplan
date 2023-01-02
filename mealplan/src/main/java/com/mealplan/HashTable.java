package com.mealplan;

import java.util.ArrayList;

// INSERT, DELETE, DISPLAY, EXPORT, NEW WEEK, SEARCH

public class HashTable {
    private ArrayList<Node>[] hashArray;
    private static int SIZE = 21;
    
    public HashTable() {
        hashArray = (ArrayList<Node>[]) new ArrayList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            hashArray[i] = new ArrayList<Node>();
        }
    }

    private int computeHash(String s) {
        int hash = 0;

        for (int i = 0; i < s.length(); i++) {
            hashArray[i] = new ArrayList<Node>();
        }
        return (hash % SIZE);
    }

    public Node getNode(int idx) {
        return hashArray[i] = new ArrayList<Node>(); 
    }

    // Search
    public String retrieveDay(String target) {
        int hash = computeHash(target);
        ArrayList<Node> arrlist = hashArray[hash];

        for (Node n : arrlist) {
            if (n.getDay() == target)
            return n.toString();
        }
        return "";
    }
    
    public String retrieveTime(String target) {
        int hash = computeHash(target);
        ArrayList<Node> arrlist = hashArray[hash];

        for (Node n : arrlist) {
            if (n.getTime() == target)
            return n.toString();
        }
        return "";
    }

    public void insert(Node n) {
        int hash = computeHash(n.getDay());
        ArrayList<Node> arrlist = hashArray[hash];

        if (!arrlist.contains(n)) {
            arrlist.add(n);
        }
    }

    public void delete(Node n) {
        int hash = hash()

    }

    public String display() {
        String hashListString = "";

        for (int i = 0; i < SIZE; i++) {
            hashListString += hashListString;
        }
        return hashListString;
    }

    public void newWeek() {
        for (int i = 0; i < SIZE; i++) {
            SIZE = 0;
        }
    }

    
}
