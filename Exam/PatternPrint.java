package Exam;

import java.util.Scanner;

public class PatternPrint {

	public static void main(String[] args) {
		// 1 2 3 4 5 6 
		// 1 2 3 4 5 
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1
        //print the pattern
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows:");
		int n=sc.nextInt();
		int i,j;
		for(i=n;i>=1;i--) {
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
