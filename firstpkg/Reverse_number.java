package firstpkg;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=256,rev=0,tmp;
		while(n!=0)
		{
			tmp=n%10;
			rev=rev*10+tmp;
			n=n/10;
		}
		System.out.println("Reverse of 256 is "+rev);
	}

}
