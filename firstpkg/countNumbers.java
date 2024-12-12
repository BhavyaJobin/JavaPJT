package firstpkg;

import java.util.Scanner;

public class countNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z=0, p=0,n=0;
		System.out.println("Enter the numbers of value is entering: ");
		Scanner sc=new Scanner(System.in);
		int nl=sc.nextInt();
		System.out.println("Enter value:");
		for(int i=0;i<nl;i++)
		{
			int c=sc.nextInt();
			if(c==0)
				z++;
			else if(c>0)
				p++;
			else
				n++;
		}
		System.out.println("Count of zero values:"+z);
		System.out.println("Count of positive values:"+p);
		System.out.println("Count of negative values:"+n);
	}

}
