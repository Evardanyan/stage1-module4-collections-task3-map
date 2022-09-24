package com.epam.mjc.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String,Integer> result = new HashMap<>();
        String [] temp = sentence.toLowerCase().replaceAll("[\\,\\.]", "").split(" ");
        Arrays.sort(temp);
        Integer count = 1;
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                if (temp[j].equals(temp[i])) {
                    count++;
                    if (count > 1) {
                        result.put(temp[j], count);
                    }
                }
            }
            count = 0;
        }
        return result;
    }
}
