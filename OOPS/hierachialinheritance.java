package OOPS;

class animal{
	
	public void animal()
	{
		System.out.println("Animal----********");
	}
}

class tiger extends animal
{
	public void tigerMethod()
	{
		System.out.println("Tiger----********");
	}
}


class deer extends animal
{
	public void deerMethod()
	{
		System.out.println("Deer----********");
	}
}
public class hierachialinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tiger t1=new tiger();
		t1.animal();
		t1.tigerMethod();
		
		deer d1=new deer();
		d1.animal();
		d1.deerMethod();
	}

}
