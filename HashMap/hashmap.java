package com.hashmap;

import java.util.HashMap;
import java.util.Map; // Import the Map interface

public class hashmapp {

    public static void main(String[] args) {
    	
    	// Creation 
        HashMap<String, String> map = new HashMap<>();

        map.put("India", "140 Cr.");
        map.put("China", "135 Cr.");
        map.put("USA", "40 Cr.");

        map.put("China", "137 Cr."); // Updating the value for the existing key

        System.out.println(map);

        // to check the key is exist or not 
        if (map.containsKey("China")) {
            System.out.println("Present");
        } else {
            System.out.println("Not Contain");
        }

        System.out.println(map.get("China"));
        System.out.println(map.get("Sri Lanka")); // It will give the value null

        // Iterate over the map entries
        
        //getkey() will return the key and getValue() will return the value of that key
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
        
        // to remove the key and value pair
        map.remove("USA");
        System.out.println(map);
    }
}
