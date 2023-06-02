package com.suntech.java8;

public class Occurences {

	public static void main(String[] args) {
		String val = "{int i=0{String val=;}}";
		int openBrcaesCount = 0;
		int closedBracesCode = 0;
		for (int i = 0; i < val.length(); i++) {
			if (val.charAt(i) == '{') {
				openBrcaesCount++;
			}
			if (val.charAt(i) == '}' && openBrcaesCount > 0) {
				closedBracesCode++;
			}
		}
		if (openBrcaesCount > closedBracesCode) {
			System.out.println(closedBracesCode);
		} else {
			System.out.println(openBrcaesCount);
		}

	}

}
