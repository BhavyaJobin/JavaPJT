package firstpkg;

import java.util.Scanner;

public class DoWhileTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans;
		   
		
			do
			{
			System.out.println("Enter 2 number: ");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a+b;
			System.out.println("Sum of 2 numbers: "+c);
			
			System.out.println("If you want to continue: y for yes and n for No");
			ans= sc.next();
			
			}while(ans=="y");
		 
	}

}
