package OOPS;

class member
{
	String name,address;
	int age, salary;
	long phoneno;
	
	public void printDetails()
	{
		System.out.println("Name      :"+name);
		System.out.println("Age       :"+age);
		System.out.println("PhoneNo   :"+phoneno);
		System.out.println("Address   :"+address);
		System.out.println("Salary    :"+salary);
	}
	
}

class Employee extends member
{
	String department="IT";
}

class Manager extends member
{
	String specialization="Management";
}

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		Manager m=new Manager();
		
		e.name="Devi";
		e.age=23;
		e.phoneno=1234567890;
		e.address="Chalakka";
		e.salary=30000;
		System.out.println(e.department);
		e.printDetails();
		
		m.name="Joy";
		m.age=23;
		m.phoneno=980764321;
		m.address="Group";
		m.salary=80000;
		System.out.println(m.specialization);
		m.printDetails();
		
		
	}

}
