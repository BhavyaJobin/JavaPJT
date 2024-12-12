package firstpkg;

public class Factorial {

	public static void main(String[] args) {
		// Fcatorial values of 5!=5*4*3*2*1
		int i,fact=1;
		
		for(i=1;i<=5;i++)
		{
			fact =fact*i;
		}
		System.out.println("Values of 5! is  "+fact);

	}

}
