package OOPS;

public class EmpConstruct {
	int empid;
	String empname;
	 public EmpConstruct(int empid,String empname)
	 {
		 this.empid=empid;
		 this.empname=empname;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpConstruct emp=new EmpConstruct(101, "Livin");
		//System.out.println("EmpID:"+emp.empid);
		//System.out.println("EmpName:"+emp.empname);
		emp.display();
	}
	public void display()
	{
		System.out.println("EmpID:"+empid);
		System.out.println("EmpName:"+empname);
	}
}
