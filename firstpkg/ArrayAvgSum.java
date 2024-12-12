package firstpkg;

import java.util.Scanner;

public class ArrayAvgSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scobj=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int arrsize=scobj.nextInt();
		int sum=0;
		
		System.out.println("Enter the array elements: ");
		int arr[]=new int[arrsize];
		
		for(int i=0;i<arrsize;i++)
		{
			arr[i]=scobj.nextInt();
			sum= sum+arr[i];
		}
		
		System.out.println("Enter the sum of array elements: "+sum);
		System.out.println("Enter the avg of array elements: "+sum/arrsize);
		
	}

}
