package com.testmaximum;

public class TestMaximum {
public static void main(String[] args) {
	
	Integer number1 = 5;
	Integer number2 = 10;
	Integer number3 = 15;
	Integer maximumNum = testMax(number1,number2,number3);
	System.out.println("Maximum Integer is: " +maximumNum);
	}

	public static Integer testMax(Integer number1, Integer number2, Integer number3) {
		Integer maximumnumber = number1;
		if(number2.compareTo(maximumnumber) > 0);
		{
			maximumnumber = number2;
		}
		if(number3.compareTo(maximumnumber) > 0);
		{
			maximumnumber = number3;
		}
		return maximumnumber;
	}
}

