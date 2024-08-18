package timecomplexity;

import java.util.*;

public class Distsnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input values
        int dis = sc.nextInt();
        int km = sc.nextInt();
        int day = sc.nextInt();
        
        // Initialize the HashMap to store special days and their corresponding kilometers
        HashMap<Integer, Integer> specialDays = new HashMap<>();
        
        // Read the special days and their corresponding kilometers
        for (int i = 0; i < day; i++) {
            int w = sc.nextInt();
            int ww = sc.nextInt();
            specialDays.put(w, ww);
        }
        
        int currentDay = 1; // start from day 1
        int totalKm = 0;    // total kilometers covered
        
        // Loop until the total kilometers covered reaches or exceeds the required distance
        while (totalKm < dis) {
            if (specialDays.containsKey(currentDay)) {
                // If the current day is a special day, add the special day's kilometers
                totalKm += specialDays.get(currentDay);
            } else {
                // If the current day is not a special day, add the default kilometers
                totalKm += km;
            }
            currentDay++; // move to the next day
        }
        
        // Output the last day number after the distance is covered
        System.out.print(currentDay - 1);
        sc.close();
    }
}
