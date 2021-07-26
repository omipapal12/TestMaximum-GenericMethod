package com.testmaximum;

public class TestMaximum {
public static void main(String[] args) {
	
	String name1 = "Omkar";
	String name2 = "Vikas";
	String name3 = "Papal";
	String maximumString = testMax(name1,name2,name3);
	System.out.println("Maximum Length String is: " +maximumString);
	}

	public static String testMax(String name1, String name2, String name3) {
		
		String maximumString = name1;
		if(name2.compareTo(maximumString) > 0);
		{
			maximumString = name2;
		}
		if(name3.compareTo(maximumString) > 0);
		{
			maximumString = name3;
		}
		return maximumString;
	}
}

