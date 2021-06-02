package com.java.learning.junk;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapFilterTest {
    public static void main(String[] args) {
        Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "ABC");
        hmap.put(2, "XCB");
        hmap.put(3, "ABB");
        hmap.put(4, "ZIO");

        Map<Integer, String> result = hmap.entrySet().stream()
                .filter(map -> map.getKey().intValue() <=3)
                .filter(map -> map.getValue().startsWith("A"))
                .collect(Collectors.toMap(map -> map.getKey(),map -> map.getValue()));
                //.collect(Collectors.toMap(map -> map.getKey(),map->map.getValue()));

        System.out.println(result);

    }

}

