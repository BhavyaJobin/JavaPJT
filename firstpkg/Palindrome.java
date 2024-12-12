package firstpkg;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int tmp=n,r,rev=0;
		
		while(n!=0)
		{
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
		}
		if(tmp==rev)
			System.out.println(tmp+" is Palindrome");
		else
			System.out.println(tmp+" is not Palindrome");
		
	}

}
