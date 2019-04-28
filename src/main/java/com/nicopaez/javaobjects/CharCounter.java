package com.nicopaez.javaobjects;

import java.util.HashMap;

public class CharCounter {
    public HashMap<Character, Integer> count(String input) {
        HashMap<Character, Integer> result = new HashMap<Character, Integer>();
        if (input == null || input == "") {
            return result;
        }
        for(Character c : input.toCharArray()) {
            int count = result.containsKey(c)?result.get(c) + 1 : 1;
            result.put(c, count);
        }
        return result;
    }
}
