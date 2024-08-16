package pack;

public class localvariable {
	
	public void empdetails() {
		//local variable 
		int empId = 739842;
		String empName = "Boomika";
		String empSalary = "50,000";
		
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Salary: "+empSalary);
	}
	
	public static void main(String[] args) {
		localvariable emp = new localvariable();
		emp.empdetails();
	}

}
