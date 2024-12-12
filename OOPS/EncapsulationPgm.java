package OOPS;

class DetailsEmp{
	private String empName,empDes;
	private int empId;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDes() {
		return empDes;
	}
	public void setEmpDes(String empDes) {
		this.empDes = empDes;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
}
public class EncapsulationPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetailsEmp ob=new DetailsEmp();
		ob.setEmpId(361488);
		ob.setEmpName("Karthiks Dev");
		ob.setEmpDes("Accountant");
		System.out.println(ob.getEmpId());
		System.out.println(ob.getEmpName());
		System.out.println(ob.getEmpDes());
	}

}
