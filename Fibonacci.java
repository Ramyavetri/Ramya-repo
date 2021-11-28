package week1.day1;

import java.util.Iterator;

public class Fibonacci {

	public static void main(String[] args) {
		int range=8;
		int num1 = 0;
		int sum, num2 =1;
		System.out.println(num1);
		System.out.println(num2);
		for (sum=2;sum<range;sum++) {
			sum=num1+num2;
			System.out.println(sum);	
			num1=num2;
			num2=sum;
		}

	}

}
