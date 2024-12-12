package OOPS;

import java.util.Scanner;

class member1
{
	String name,address;
	int age, salary;
	long phoneno;
	
	public void readDetails()
	{
		System.out.println("Enter the Employee details Name, Age,phoneno,Address,salary:");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		age=sc.nextInt();
		phoneno=sc.nextLong();
		address=sc.next();
		salary=sc.nextInt();
	}
	public void printDetails()
	{
		System.out.println("Name      :"+name);
		System.out.println("Age       :"+age);
		System.out.println("PhoneNo   :"+phoneno);
		System.out.println("Address   :"+address);
		System.out.println("Salary    :"+salary);
	}
}
class Employee1 extends member1
{
	String specialization="Software", department="IT";
}
class Manager1 extends member1
{
	String specialization="Management", department="HR";
}
public class Employee2Details {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e=new Employee1();
		Manager1 m=new Manager1();
		
		e.readDetails();
		e.printDetails();
		System.out.println("Specialization: "+e.specialization);
		System.out.println("Department: "+e.department);
		
		System.out.println("\n");
		m.readDetails();
		m.printDetails();
		System.out.println("Specialization: "+m.specialization);
		System.out.println("Department: "+m.department);
	}

}
