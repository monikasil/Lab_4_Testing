package com.example.textcountersample.utils;

import com.example.textcountersample.MainActivity;

//Class for counting characters
public class ElementsCalculator {
    public static int getCharsCount(String inputText) {
        if (inputText != null) {
            return inputText.length();
        }
        return 0;
    }
}
