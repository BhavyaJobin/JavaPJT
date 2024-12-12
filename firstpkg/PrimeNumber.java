package firstpkg;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,flag=0;
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0) {
				System.out.println("Not a prime");
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println(n+" is a prime");
	}

}
