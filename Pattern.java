/*
 * Pattern.java
 * 
 * Copyright 2020 UserBen <user1@mymachine>
 */
import java.util.*;

public class Pattern {
	
	public static void main (String[] args) {
		
		System.out.println("Enter number: ");
		Scanner scan = new Scanner(System.in);
		int bnum = scan.nextInt();
		
		for(int i=1; i<=bnum; i++){
			for(int j=0; j<i; j++){
				System.out.print("*");}
			System.out.println();}
			
		for(int i=bnum-1; i>0; i--){
			for(int j = 0; j<i; j++){
				System.out.print("*");}
			System.out.println();}
		
	}
}

