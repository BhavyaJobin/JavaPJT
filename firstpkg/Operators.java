package firstpkg;

public class Operators {

	public static void main(String[] args) {
		
		// Arithmetic operators
		int a=20,b=10;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a+b="+(a+b));
		System.out.println("a%b="+(a%b));
		
		//Assignment operators
		int c=a;//20
		System.out.println("Value of C is "+c);//20
		System.out.println("a+=b="+(a+=b));//a=a+b 20+10=30
		System.out.println("a-=b="+(a-=b));//a=a-b 30-10=20
		
		//Relational Operators
		System.out.println("a==b "+(a==b));
		System.out.println("a!=b "+(a!=b));
		System.out.println("a>=b "+(a>=b));
		System.out.println("a<=b "+(a<=b));
		System.out.println("a>b "+(a>b));
		System.out.println("a<b "+(a<b));
		
		//Logical operators
		// A	B	A&&B	A||BB	!A	!B
		// 0	0	0		0		1	1
		// 1	0	0		1		0	1
		// 0	1	0       1		1	0
		// 1	1	1		1		0	0
		
		String username="qwerty";
		String password="asd123";
		System.out.println((username=="qwerty")&&(password=="asd123"));
		System.out.println((username=="qwerty")&&(password=="asd124"));
		System.out.println((username=="qwerty")||(password=="asd124"));
		System.out.println(!(username=="qwe123"));
		
		//Unary operators
		//c1++  post increment
		//++c1  Pre increment
		
		int c1=100;
		System.out.println(c1++);  //100	
		System.out.println(c1);    //101
		System.out.println(++c1);  //102
		
		int a1=200;
		System.out.println(a1--);
		System.out.println(a1);
		System.out.println(--a1);
		
		//Ternary operators variable=condition?expr1:expr2;
		String v=c1>a1?"c1 is larger":"a1 is larger";
		System.out.println(v);
		
	}
	

}
