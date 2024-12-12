package firstpkg;

public class fibnocciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c = 0,i,n=100;
		
	/*	for(i=2;i<=10;i++)
		{
			c=a+b;
			
			System.out.print(" "+c);
			
			
		}*/
		
		while(a<=n)
		{
			System.out.print(a+ " ");
			c=a+b;
			a=b;
			b=c;
			
		}
	}

}
