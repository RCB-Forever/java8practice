package com.suntech.java8;


//Java Program to Check Whether String contains Special
//Characters using Regex classes

//Importing regex classes from java.util package to
//match a specific pattern
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Main class
public class ds {
	// Main driver method
	public static void main(String[] args)
	{
		// Declaring and initializing strings randomly
		// with input characters

		// Custom Input as String 1
		String s1 = "Gee12345ksForGee#@!ks";

		// Creating regex pattern by
		// creating object of Pattern class
	Pattern p = Pattern.compile("^[a-zA-Z0-9]+$");
//			"[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		
System.out.println(p.matcher("Password@123").find());
		// Creating matcher for above pattern on our string
		Matcher m = p.matcher(s1);

		// Now finding the matches for which
		// let us set a boolean flag and
		// imposing find() method
		boolean res = m.find();

		// Output will be based on boolean flag

		// If special characters are found
		if (res)

			// Display this message on the console
			System.out.println(
				"String1 contains Special Characters");

		// If we reach here means no special characters are
		// found
		else

			// Display this message on the console
			System.out.println(
				"No Special Characters found in String 1");

		// Custom Input as String 2
		String s2 = "!!Geeks.For.Geeks##";

		// Creating matcher for above pattern on our string
		// by creating object of matcher class
		Matcher m2 = p.matcher(s2);

		// Finding the matches using find() method
		boolean res2 = m2.find();

		// If matches boolean returns true
		if (res2)

			// Then print and display thta special
			// characters are found
			System.out.println(
				"String 2 contains Special Characters");

		// If not
		else

			// Then Display the print statement below
			System.out.println(
				"No Special Characters found in String 2");
	}
}
