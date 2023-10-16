
public class Employee {
	int empNo;
	String empName;
	String desig;
	String dept;
	int sal;
	
	public void readEmpData(int empNo, String empName, String desig, String dept, int sal ){
//		System.out.println("Enter the Employee Id : ");
		this.empNo = empNo;
//		System.out.println("Enter the Employee Name : ");
		this.empName = empName;
//		System.out.println("Enter the Employee Designation : ");
		this.desig = desig;
//		System.out.println("Enter the Department : ");
		this.dept = dept;
//		System.out.println("Enter the Salary : ");
		this.sal = sal;
	}
	public void displayEmpData() {
		System.out.println("Employe id : " + empNo);
		System.out.println("Employe Name : " + empName);
		System.out.println("Designation : " + desig);
		System.out.println("Department : " + dept);
		System.out.println("Salary: " + sal);
	}
	
}
