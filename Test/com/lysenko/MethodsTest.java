package com.lysenko;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class MethodsTest {
    private Methods methods = new Methods();

    @Test
    public void testCountA1() {
//        List<String> list = new ArrayList<>();
//        list.add("a1");
//        list.add("a2");
//        list.add("a3");
//        list.add("a1");

        List<String> list = Arrays.asList("a1", "a2", "a3", "a1");


        int expectedCount = 2;
        int actualCount = methods.countA1(list);

        assertEquals(expectedCount, actualCount);
    }
}