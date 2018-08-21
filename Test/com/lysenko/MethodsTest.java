package com.lysenko;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

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


    @Test
    public void firstElement(){
        List<String> list = Arrays.asList("a1", "a2", "a3", "a1");
        String expectedResult = "a1";
        String actualValue = methods.firstElement(list);
        assertEquals(expectedResult, actualValue);

    }

    @Test
    public void firstElement2(){
        List<String> list = new ArrayList<>();
        String expectedResult = "0";
        String actualValue = methods.firstElement(list);
        assertEquals(expectedResult, actualValue);
    }

    @Test
    public void lastElemNotNull(){
        List<String> list = Arrays.asList("a1", "a2", "a3", "a4");
        String expectedResult = "a4";
        String actualValue = methods.firstElement(list);
        assertEquals(expectedResult, actualValue);
    }

    @Test
    public void lastElemNull(){
        List<String> list = new ArrayList<>();
        String expectedResult = "Empty";
        String actualValue = methods.lastElement(list);
        assertEquals(expectedResult, actualValue);
    }

    @Test
    public void thirdElementNotNull(){
        List<String> list = Arrays.asList("a1", "a2", "a3", "a4");
        String expectedResult = "a3";
        String actualValue = methods.thirdElement(list);
        assertEquals(expectedResult, actualValue);
    }

    @Test(expected = NoSuchElementException.class)
    public void thirdElementNull(){
        List<String> list = Arrays.asList("a1", "a2");
        String actualValue = methods.thirdElement(list);
    }

}