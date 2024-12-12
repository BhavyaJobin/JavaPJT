package firstpkg;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=25612345,x=0;
		while(n!=0)
		{
			int tmp=n%10;
			n=n/10;
			x=x+1;
		}
		System.out.println("Count is "+x);
	}

}
