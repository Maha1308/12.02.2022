package com.javaprogram;

public class nestedif {

	public static void main(String[] args) {
		int n = -8;
		if(n>0) {
			{
			System.out.println("it is positive n umber");
		}
		if(n%2==0)
		{
			System.out.println("it is even number");
		}
		else
		{
			System.out.println("it is odd number");
		}
	}
	else 
	{
		System.out.println("it is negative number");
	}

	}

}
