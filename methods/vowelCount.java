package methods;

import java.util.Scanner;

public class vowelCount {

	public static void main(String[] args) {
		// Vowel count using Method
		
		vowelCount count=new vowelCount();
		count.vCount();
		

	}

	public void vCount()
	{
		System.out.println("Enter the String :");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int c=0;
		
		int l=str.length();
		for(int i=0;i<l;i++)
		{
			if((str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'))
					{
						c++;
					}
			
		}
		System.out.println("Vowel Count is "+c);
	}
}
