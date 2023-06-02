package com.suntech.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class findDuplicatesUsingSet {
	public static Set<String> getDuplicates(List<String> list) {
	    return list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet());
	}
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
        list.add("Sagio Mane");
        list.add("Karius");
        list.add("Mo Salah");
        list.add("Firmino");
        list.add("Lovren");
        list.add("Steven Gerrard");
        list.add("Karius");
        list.add("Mo Salah");
        System.out.println(getDuplicates(list));
	}


}
