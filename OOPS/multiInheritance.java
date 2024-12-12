package OOPS;

class birds
{
	public void birdDetails()
	{
		System.out.println("Bird details........");
	}
}
class hen extends birds
{
	public void henMethod()
	{
		System.out.println("Hen .......");
	}
}

class chicken extends hen
{
	public void chickenMethod()
	{
		System.out.println("Chicken .............");
	}
}

public class multiInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chicken obc=new chicken();
		obc.birdDetails();
		obc.chickenMethod();
		obc.henMethod();
	}

}
