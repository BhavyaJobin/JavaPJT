package firstpkg;

public class ObtEmployee {
	int EmpId;
	String EmpName,EmpDesgn;      //Instance variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObtEmployee emp1=new ObtEmployee();
		
		emp1.EmpId=101;
		emp1.EmpName="Keerthana Nair";
		emp1.EmpDesgn="QA Analyst";
		
		ObtEmployee emp2=new ObtEmployee();
		
		emp2.EmpId=103;
		emp2.EmpName="Deepak K";
		emp2.EmpDesgn="Test Engineer";
		
		System.out.println("EmployeeNo:"+emp1.EmpId+"\nEmployeeName:"+emp1.EmpName+"\nEmployeeDesignation:"+emp1.EmpDesgn);
		System.out.println("EmployeeNo:"+emp2.EmpId+"\nEmployeeName:"+emp2.EmpName+"\nEmployeeDesignation:"+emp2.EmpDesgn);
	}

}
