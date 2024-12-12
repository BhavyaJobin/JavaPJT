package firstpkg;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int number=n,tmp=0,r=0;
		while(n!=0)
		{
			r=n%10;
			tmp=tmp+(r*r*r);
			n=n/10;
		}
		if(number==tmp)
			System.out.println(number+" is Armstrong");
		else
			System.out.println(number+" is not Armstrong");
	}

}
