package org.example.Other_EXamples_done_at_Home;

import java.util.HashMap;

public class EX_5_basic {
    public static void main(String[] args) {

        HashMap<String, String> The_Tourist = new HashMap<>();
        The_Tourist.put("Wijdan", "1111864359");
        The_Tourist.put("Sara", "999122236");
        The_Tourist.put("Razan", "6666111907");

        System.out.println(The_Tourist.values());
        System.out.println("info of The_Tourist " + The_Tourist.get("Wijdan"));
        The_Tourist.remove("Sara");
        System.out.println("Number of The_Tourist: " + The_Tourist.size());
        System.out.println("The_Tourist Records is :" + The_Tourist);
    }
}
