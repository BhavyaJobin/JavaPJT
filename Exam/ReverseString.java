package Exam;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// Write a java program for reverse a string
		System.out.println("Enter the string to be reversed: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String rev="";
		int l=str.length();
		
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse string is "+rev);

	}

}
