package OOPS;

interface TVremote{
	public void channelchg();
	public void sleep();
	public void guide();
}
interface smartTVremote extends TVremote{
	public void browers();
	public void apps();
	public void cast();
	@Override
	default void channelchg() {
		// TODO Auto-generated method stub
		System.out.println("Change channels");
	}
	@Override
	default void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Set to sleep mode");
	}
	@Override
	default void guide() {
		// TODO Auto-generated method stub
		System.out.println("Goto TV guide");
	}
	
}
class TV implements smartTVremote{

	@Override
	public void browers() {
		// TODO Auto-generated method stub
		System.out.println("Select the browser");
	}

	@Override
	public void apps() {
		// TODO Auto-generated method stub
		System.out.println("Apps for movie watching");
	}

	@Override
	public void cast() {
		// TODO Auto-generated method stub
		System.out.println("Cast from mobile or laptops");
	}
	
}
public class InterfaceTaskTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV ob=new TV();
		ob.apps();
		ob.browers();
		ob.cast();
		ob.channelchg();
		ob.guide();
		ob.sleep();
	}

}
