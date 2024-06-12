package org.example.Exercises_During_Training;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RandW_file {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();


        HashMap<Character, Integer> charCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int character;


            while ((character = reader.read()) != -1) {
                char ch = (char) character;
                if (!Character.isWhitespace(ch)) {
                    charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }


        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }

}
