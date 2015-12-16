package com.thoughtworks.tw101.exercises.exercise7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = inputStream.readLine();
            if (inputLine.length() == 0 ) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }

        return inputLine.toLowerCase();
    }
}
