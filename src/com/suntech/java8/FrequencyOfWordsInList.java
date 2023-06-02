package com.suntech.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FrequencyOfWordsInList {
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("STUBB","BAT", "ANT", "ANT", "STUBB","CAT", "BAT", "ANT","DOG","ZEBRA");
 
        Set<String> distinct = new TreeSet<>(list);
        for (String s: distinct) {
            System.out.println(s + ": " + Collections.frequency(list, s));
        }
    }
}