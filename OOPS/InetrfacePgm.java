package OOPS;

interface CarDetails{
	public void acceleraton();
	public void SpeedLimit();
	public void torque();
}

class Benz implements CarDetails{

	@Override
	public void acceleraton() {
		// TODO Auto-generated method stub
		System.out.println("Maruthi acceleraltion is good compared to other versions");
	}

	@Override
	public void SpeedLimit() {
		// TODO Auto-generated method stub
		System.out.println("Maruthi speedlimit is acceptable");
	}

	@Override
	public void torque() {
		// TODO Auto-generated method stub
		System.out.println("Maruthi torque ");
	}
	
}
public class InetrfacePgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Benz ob=new Benz();
		ob.acceleraton();
		ob.SpeedLimit();
		ob.torque();
	}

}
