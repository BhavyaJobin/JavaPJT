package firstpkg;

import java.util.Scanner;

public class Number3IncreaseorDecrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 3 numbers: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a<b&&b<c)
		{
			System.out.println("Increasing");
		}
		else if(a>b&&b>c)
		{
			System.out.println("Decreasing");
		}
		else
			System.out.println("Neither Increasing nor decreasing order");
	}

}
