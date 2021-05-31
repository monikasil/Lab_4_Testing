package com.example.textcountersample;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String removeExcessiveSpacesFromString(String inputText) {
        String[] wordsArray = inputText.split("\\s");
        ArrayList<String> wordsArrayWithoutEmptySpaces = new ArrayList<>();
        for (String word : wordsArray) {
            if (!word.isEmpty()) {
                wordsArrayWithoutEmptySpaces.add(word);
            }
        }
        return String.join(" ", wordsArrayWithoutEmptySpaces);
    }

    //Added testing. Sets first letter to capital
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String setStringFirstCapital(String inputText) {
        String words = inputText;
        String withCapitalLetter = words.substring(0, 1).toUpperCase() + words.substring(1);
        return withCapitalLetter;
    }

    //Added testing. Checks if string includes only symbols. If there's no text - returns True
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String checkIfOnlySpecialCharacters(String inputText) {
        String regex = "[^a-zA-Z0-9]+";
        Pattern specChPattern = Pattern.compile(regex);

        Matcher m = specChPattern.matcher(inputText);
        if (inputText == null) {
            System.out.println("No");
            return "False";
        }

        if (m.matches()) {
            return ("True");
        }else {
            return ("False");
        }
    }
}
