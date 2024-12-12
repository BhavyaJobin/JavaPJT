package methods;

public class firstMethod {

	public static void main(String[] args) {
		// main method
		firstMethod fm=new firstMethod();
		fm.add();
		System.out.println(fm.sub());
		fm.multi(30, 23);
		System.out.println(fm.div(699, 3));

	}
	//without return type and without parameter
	public void add()
	{
		int a=9,b=7,c;
		c=a+b;
		System.out.println(c);
	}
	
	//with returntype and  without parameter
	public int sub()
	{
		int a=30,b=4,c;
		c=a-b;
		return c;
	}
	
	//without returntype and with parameter
	public void multi(int a, int b)
	{
		int c=a*b;
		System.out.println(c);
	}
	
	//with return type and with parameter
	public double div(int a,int b)
	{
		double c=a/b;
		return c;
	}

}
