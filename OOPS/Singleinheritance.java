package OOPS;

class car{
	public void displayMethod()
	{
		System.out.println("Car Details");
	}
}

class bmw1 extends car
{
	public void bmwDetails()
	{
		System.out.println("BMW Details");
	}
}

public class Singleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bmw1 obm=new bmw1();
		obm.bmwDetails();
		obm.displayMethod();

	}

}
