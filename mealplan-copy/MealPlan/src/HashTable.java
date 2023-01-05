import java.util.ArrayList;

public class HashTable {
    private ArrayList<Meal>[] hashArray;
    private static final int SIZE = 21;

    public HashTable() {
        hashArray = (ArrayList<Meal>[]) new ArrayList[SIZE];

        for (int i = 0; i < SIZE ; i++) {
            hashArray[i] = new ArrayList<Meal>();
        }
    }

    private int computeHash(int num) {
        return num % SIZE;
    }

    public String find(int target) {
        int hash = computeHash(target);
        ArrayList<Meal> arrList = hashArray[hash];

        for (Meal m : arrList) {
            if (m.getNumber() == hash) {
                return m.toString();
            }
        }
        return "";
    }

    public void add(int num, String meal, String day, String time) {
        Meal m = new Meal(num, meal, day, time);

        int hash = computeHash(num);
        ArrayList<Meal> arrList = hashArray[hash];

        if (!arrList.contains(m)) {
            arrList.add(m);
        }
    }

    public String display() {
        return toString();
    }

    public void delete(int num) {
        int hash = computeHash(num);
    
        ArrayList<Meal> arrList = hashArray[hash];
        
        if (arrList.contains(hash)) {
            arrList.remove();
        } else {
            System.out.println("Does not exist.");
        }
        
    }

    public void newWeek() {
        
    }

    @Override
    public String toString() {
        String results = "";

        for (ArrayList<Meal> m : hashArray) {
            String s = m.toString();

            s = s.replace("[", "").replace("]", "\n").replace(",", "\n");
            results += s;
        }
        return results;
    }
}