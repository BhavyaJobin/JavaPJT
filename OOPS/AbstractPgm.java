package OOPS;

abstract class Cars{
	abstract public void acceleration();
	
	public void carEngine()
	{
		System.out.println("Car Engine Details");
	}
}

class BMW extends Cars
{

	@Override
	public void acceleration() {
		System.out.println("BMW accleration is good");
		
	}
	
}

class Kia extends Cars
{

	@Override
	public void acceleration() {
		System.out.println("Kia accleration is good with *****");
		
	}
	
}
public class AbstractPgm {

	public static void main(String[] args) {
		BMW ob=new BMW();
		ob.acceleration();
		ob.carEngine();
		Kia obk=new Kia();
		obk.acceleration();
		obk.carEngine();

	}

}
