package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Map<String, String> lettersToWords = new HashMap<>();
        lettersToWords.put("A", "Alpha");
        lettersToWords.put("B", "Bravo");
        lettersToWords.put("C", "Charlie");
        lettersToWords.put("D", "Delta");
        lettersToWords.put("E", "Echo");
        lettersToWords.put("F", "Foxtrot");
        lettersToWords.put("G", "Golf");
        lettersToWords.put("H", "Hotel");
        lettersToWords.put("I", "India");
        lettersToWords.put("J", "Juliet");
        lettersToWords.put("K", "Kilo");
        lettersToWords.put("L", "Lima");
        lettersToWords.put("M", "Mike");
        lettersToWords.put("N", "November");
        lettersToWords.put("O", "Oscar");
        lettersToWords.put("P", "Papa");
        lettersToWords.put("Q", "Quebec");
        lettersToWords.put("R", "Romeo");
        lettersToWords.put("S", "Sierra");
        lettersToWords.put("T", "Tango");
        lettersToWords.put("U", "Uniform");
        lettersToWords.put("V", "Victor");
        lettersToWords.put("W", "Whiskey");
        lettersToWords.put("X", "X-Ray");
        lettersToWords.put("Y", "Yankee");
        lettersToWords.put("Z", "Zulu");


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word or phrase : ");

        String userInput = scan.nextLine().toUpperCase();
        String translated = "";

        for (int i = 0; i < userInput.length(); i++) {

            String checker = Character.toString(userInput.charAt(i));

            if (lettersToWords.containsKey(checker)){

                translated += " " + lettersToWords.get(checker);

            }
            else translated += " " + checker ;
        }

    System.out.println("Your input: " + userInput);
    System.out.println("Your input converted is : " + translated);
    }
}
