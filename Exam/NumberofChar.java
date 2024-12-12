package Exam;

public class NumberofChar {

	public static void main(String[] args) {
		//write a java program to count the total number of   characters in a string
		
		String str="Luminar Technolab ";
		int l=str.length();
		//System.out.println(l);
		int i,c = 0;
		for(i=0;i<l;i++)
		{
			if(str.charAt(i)!=' ') {
				c++;
			}
		}
		System.out.println("Count the total number of characters in a string is "+c);
	}

}
