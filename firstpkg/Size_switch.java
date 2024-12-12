package firstpkg;

public class Size_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=44;
		
		switch(s)
		{
		case 29: 
			System.out.println("Small");
			break;
		case 36: 
			System.out.println("Medium");
			break;
		case 42: 
			System.out.println("Large");
			break;
		case 44: 
			System.out.println("Extra large");
			break;
		default:
			System.out.println("Invalid Size");

	    }

	}
}
