package firstpkg;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");  
		String str= sc.nextLine();  
		//System.out.print("You have entered: "+str);
		String sh="";
		
		int l=str.length();
		System.out.println(l);
		for(int i=l-1;i>=0;i--)
		{
			sh=sh+str.charAt(i);
		}
		if(str.equalsIgnoreCase(sh))
		{
			System.out.println(str+" is palindrome");
		}
		else
			System.out.println(str+" is not palindrome");
	}

}
