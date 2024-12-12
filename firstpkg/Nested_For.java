package firstpkg;

public class Nested_For {

	public static void main(String[] args) {
		// Nested For
		//***
		//***
		//***
		int i,j;
/*		for(i=1;i<=3;i++)
		{
			for(j=1;j<=3;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//*
		//**
		//***
		//****
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		//1
		//12
		//123
		//1234
		for(i=0;i<4;i++)
		{
			for(j=0;j<=i;j++)
				System.out.print(j+1);
			
			System.out.println();
		}
		*/
		//1 
		//2 3 
		//4 5 6 
		//7 8 9 10 
		int v=1;
		for(i=0;i<4;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(v+" ");
			    v++;
			}
			System.out.println();
		}
		int n,m;
		for(n=1;n<=4;n++)
		{
			for(m=1;m<n+1;m++)
			{
				System.out.print(m);
			    
			}
			System.out.println();
		}
	}

}
