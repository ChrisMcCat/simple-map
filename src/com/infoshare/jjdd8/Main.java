package com.infoshare.jjdd8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String words = new String("fox", "quick", "brown", "quick", "fox", "fox", "fox");

        public static Map<String, Integer> getWordCounts(List<String> words) {
            Map<String, Integer> wordCounts = new HashMap<>();

            for (String word : words) {
                if (wordCounts.containsKey(word)){
                    wordCounts.put(word, 1);
                }
                else {
                    int currentCount = wordCounts.get(word);
                    currentCount++;
                    wordCounts.put(word, +1);

                }
            }
        }

//           String words = new String("fox", "quick", "brown", "quick", "fox", "fox", "fox");
//
//        Map<String, Integer> wordsCount = new HashMap<>();
//
//        wordsCount.put(words);
//
//        for (String words : wordsCount.keySet()) {
//            System.out.printf("Slow %s wystapilo %d razy. \n", words, wordsCount.get(words));
//        }

    }
}
