package OOPS;

public class methodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverLoading ob=new methodOverLoading();
		ob.add();
		ob.add(34,23);
		ob.add(20, 10.3);
		ob.add(23.4,45);
		
	}
	public void add()
	{
		int a=10,b=55,c;
		c=a+b;
		System.out.println(c);
	}
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a, double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	public void add(double a, int b)
	{
		double c=a+b;
		System.out.println(c);
	}
}
