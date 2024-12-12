package OOPS;

public class ExceptionPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int c=5/0;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("ArithmeticException: / by zero");
			System.out.println(e.getMessage());
		}
		System.out.println("Finished");
		
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e1) {
			System.out.println("Error Message");
		}
	}

}
