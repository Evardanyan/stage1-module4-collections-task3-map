package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<Integer, String> map = new HashMap<>(sourceMap);
        final Iterator<Map.Entry<Integer, String>> iter = map.entrySet().iterator();
        final HashSet<String> valueSet = new HashSet<String>();
        while (iter.hasNext()) {
            final Map.Entry<Integer, String> next = iter.next();
            if (!valueSet.add(next.getValue())) {
                iter.remove();
            }
        }
        Map<String, Integer> swapped = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        return swapped;
    }
}
