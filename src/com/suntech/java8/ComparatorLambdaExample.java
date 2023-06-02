package com.suntech.java8;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {

		//Prior to java 8
		Comparator<Integer> c1=new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
//				return o1 > o2 ? 1 : o1<o2 ? -1 : 0;
				return o1.compareTo(o2);
			}
		};
		
		System.out.println(c1.compare(3, 2));
		
		//After java 8
//		Comparator<Integer> c2 = (Integer a,Integer b) -> a.compareTo(b);
		Comparator<Integer> c2 = (a,b) -> a.compareTo(b);
		
		System.out.println(c2.compare(3, 2));
	}

}
