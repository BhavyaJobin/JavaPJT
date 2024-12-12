package OOPS;

class father
{
	public void job()
	{
		System.out.println("Father Job is Engineer");
	}
	public void quali()
	{
		System.out.println("Fathers qaulification is MTech");
	}
}
class son extends father
{

	@Override
	public void job() {
		System.out.println("Son's Job is Doctor");
		super.job();
	}

	@Override
	public void quali() {
		System.out.println("Son's qaulification is MBBS");
		super.quali();
	}
	
}
public class methodOverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son obson=new son();
        obson.job();
		obson.quali();
		//father fob=new father();
		//fob.job();
		//fob.quali();
	}

}
