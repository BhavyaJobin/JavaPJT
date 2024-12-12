package firstpkg;

public class Swap_without_Third {

	public static void main(String[] args) {
		// input int a=20,b=30  swap without variable  output a=30, b=20
		
		int a=20,b=30;
		System.out.println("Values of a before swapping "+a+"   Values of b before swapping "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Values of a after swapping "+a+"   Values of b after swapping "+b);

	}

}
