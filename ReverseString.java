/*
 * ReverseString.java
 * 
 * Copyright 2020 UserBen <user1@mymachine>
 * 
 */

public class ReverseString {
	
	public static void main (String[] args) {
		String s = "Tamimi";
		System.out.println(s);
		String r = reverse(s);
		System.out.println(r);
	}
	
	public static String reverse(String s){	
		String r = "";
		
		for(int i=s.length()-1; i >= 0; i--){
			r = r + s.charAt(i);
			}
		return r;
		}
}

