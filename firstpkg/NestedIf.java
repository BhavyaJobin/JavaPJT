package firstpkg;

public class NestedIf {

	public static void main(String[] args) {
		// Check whether 55 is divisible 5 and 11
		int a=23;
		if(a%5==0)
			
			if(a%11==0)
				System.out.println("a is divisible by 5 and 11");
			else
				System.out.println("a is divisble by 5 only");
		
		else
			System.out.println("Not divisble by 5");

	}

}
