package methods;

import java.util.Scanner;

public class shapeArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shapeArea area=new shapeArea();
		area.triangle();
		
		System.out.println("Area of circle is "+area.circle());
		
		area.square(5);
		
		System.out.println("Area of rectanle is "+area.rectangle(45, 20));
		
	}

		public void triangle()
		{
			System.out.println("Enter breath and height:");
			Scanner sc=new Scanner(System.in);
			int b=sc.nextInt();
			int h=sc.nextInt();
			double c=.5*b*h;
			System.out.println("Area of triangle is "+c);
		}
	    
		public int circle()
		{
			System.out.println("Enter the radius of the circle :");
			Scanner sc1=new Scanner(System.in);
			int r=sc1.nextInt();
			double c= 3.14*r*r;
			return (int) c;
		}
		
		public void square(int s)
		{
			int a=s*s;
			System.out.println("Area of square is "+a);
		}
		
		public int rectangle(int l,int b)
		{
			int a=l*b;
			return a;
		}

}
