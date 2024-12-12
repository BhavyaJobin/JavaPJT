package firstpkg;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a string
		System.out.println("Enter the string to be reversed: ");
		Scanner screv=new Scanner(System.in);
		String str=screv.next();
		String rev="";
		int l=str.length();
		
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversestring is "+rev);
	}

}
