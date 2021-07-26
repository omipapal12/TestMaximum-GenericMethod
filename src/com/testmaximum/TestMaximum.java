package com.testmaximum;

public class TestMaximum {
public static void main(String[] args) {
	
	Float number1 = 5.1f;
	Float number2 = 10.2f;
	Float number3 = 15.3f;
	Float maximumNum = testMax(number1,number2,number3);
	System.out.println("Maximum Float Number is: " +maximumNum);
	}

	public static Float testMax(Float number1, Float number2, Float number3) {
		Float maximumnumber = number1;
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

