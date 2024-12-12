package firstpkg;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int i,j;
		String user[][]=new String[3][2];
		System.out.println("Enter the Username and password");
		for(i=0;i<3;i++)
		{
			for(j=0;j<2;j++)
			{
				user[i][j]=scan.next();
			}
			System.out.println();
		}
		System.out.print("Username and password is : \n");
		for (i = 0; i < 3; i++) {
		      for (j = 0; j < 2; j++) {
		        System.out.print(user[i][j] + "  ");
		      }
		      System.out.println();
		    }
	}

}
