package Exam;

import java.util.Scanner;

public class OddEvenArray {

	public static void main(String[] args) {
		// write a Java Program to Print Odd and Even Numbers from an array
		
		
		Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements in array:");
        int n = s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = s.nextInt();
        }
        System.out.println("Even Numbers are ");
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Odd Numbers are ");
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }
			
	}

}
