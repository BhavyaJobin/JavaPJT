package firstpkg;

public class Pattern1 {

	public static void main(String[] args) {
		// pattern print
		//1 1 1 1 1
		//2 2 2 2
		//3 3 3
		//4 4
		//5
		
		for (int i=1;i<=5;i++)
		{
			for (int j=i;j<=5;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		//12345
		//1234
		//123
		//12
		//1
		
		for (int i=5;i>=1;i--)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
