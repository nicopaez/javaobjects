package com.nicopaez.javaobjects;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CharCounterTest {

    @Test
    public void whenInputIsNullReturnEmpty() {
        CharCounter charCounter = new CharCounter();
        HashMap<Character, Integer> result = charCounter.count(null);
        assertTrue(result.isEmpty());
    }

    @Test
    public void whenInputIsBlankReturnEmpty() {
        CharCounter charCounter = new CharCounter();
        HashMap<Character, Integer> result = charCounter.count("");
        assertTrue(result.isEmpty());
    }

    @Test
    public void whenInputIsMamaReturnM2A2() {
        CharCounter charCounter = new CharCounter();
        HashMap<Character, Integer> result = charCounter.count("mama");
        assertEquals(new Integer(2), result.get('a'));
        assertEquals(new Integer(2), result.get('m'));
    }
}
