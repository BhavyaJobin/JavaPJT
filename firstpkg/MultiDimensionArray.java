/**
 * 
 */
package firstpkg;

import java.util.Scanner;

/**
 * 
 */
public class MultiDimensionArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arrmulti=new int[2][2];
		int i,j = 0;
		Scanner scobj=new Scanner(System.in);
		
		System.out.println("Enter the array elements:");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				arrmulti[i][j]=scobj.nextInt();
			}
		}
		System.out.print("Array : \n");
		for (i = 0; i < 2; i++) {
		      for (j = 0; j < 2; j++) {
		        System.out.print(arrmulti[i][j] + "  ");
		      }
		      System.out.println();
		    }
		
	}

}
