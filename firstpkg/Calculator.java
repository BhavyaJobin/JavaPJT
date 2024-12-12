package firstpkg;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 number: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Calcultion");
		
		char cal=sc.next().charAt(0);
		int c;
		switch(cal)
		{
		case '+': 
			c=a+b;
			System.out.println(c);
			break;
		case '-': 
			c=a-b;
			System.out.println(c);
			break;
		case '*': 
			c=a*b;
			System.out.println(c);
			break;
		case '/': 
			c=a/b;
			System.out.println(c);
			break;
		case '%': 
			c=a%b;
			System.out.println(c);
			break;
		default: 
			System.out.println("Invalid calculation");
		}
	}
}
