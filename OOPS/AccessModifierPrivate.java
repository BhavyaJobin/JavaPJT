package OOPS;

public class AccessModifierPrivate {
	
	private int a;   //private
	int b;  //default
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifierPrivate ob=new AccessModifierPrivate();
		ob.a=10;
		ob.b=22;
		
		System.out.println(ob.b);
	}

}
