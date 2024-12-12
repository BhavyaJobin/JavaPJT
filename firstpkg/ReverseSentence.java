package firstpkg;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		System.out.println("Enter a sentence to be reversed:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		String[] res=str.split(" ");
		String result = "";
		 
        int l=res.length;
        System.out.println(l);
        
        for (int i = 0; i <l; i++) {
        	if (i == l - 1) {
                result = res[i] + result; 
        	System.out.println("if print"+result);
        	}
            else {
        	    result = " " + res[i] + result;
        	System.out.println("Else print"+result);
            }
        }
        System.out.println(result);
        System.out.println("finish");
	}

}
