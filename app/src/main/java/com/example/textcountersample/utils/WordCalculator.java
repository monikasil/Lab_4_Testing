package com.example.textcountersample.utils;

import com.example.textcountersample.MainActivity;
//Class for counting words
public class WordCalculator {
    public static int getWordsCount(String inputText) {
        if (!inputText.equals("")) {
            String[] words = inputText.split("\\s+");
           return words.length;
        }else {
            return 0;
        }
    }
}
