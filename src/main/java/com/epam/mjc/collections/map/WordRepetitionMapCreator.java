package com.epam.mjc.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String,Integer> result = new HashMap<>();
        if (sentence.isEmpty()) {
            return result;
        }
        String [] temp = sentence.toLowerCase().split("[ ,.!-]+");
        Arrays.sort(temp);
        for (String word : temp) {
            if (result.containsKey(word)) {
                int count = result.get(word) + 1;
                result.put(word, count);
            } else {
                result.put(word, 1);
            }
        }
        return result;
    }
}
