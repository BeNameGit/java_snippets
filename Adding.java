/*
 * Adding.java
 * 
 * Copyright 2020 UserBen <user1@mymachine>
 */
import java.util.Scanner;

public class Adding {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number a: ");
		int a = scan.nextInt();

		System.out.println("Enter another number b: ");
		int b = scan.nextInt();
		
		int r = a + b;
		System.out.println("a + b is: " + (a+b));
		
	}
}

