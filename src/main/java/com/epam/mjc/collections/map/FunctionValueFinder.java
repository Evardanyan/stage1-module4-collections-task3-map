package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);

        for (Map.Entry<Integer, Integer> me: functionMap.entrySet()) {
            if (requiredValue == me.getValue())
                return true;
        }

        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer x : sourceList) {
            map.put(x, 5 * x + 2);
        }

        return map;
    }
}
