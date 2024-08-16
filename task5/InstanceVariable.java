package task;

public class InstanceVariable {
	// Instance variable
	String name;
	int age;

	// Constructor to initialize instance variables
	public InstanceVariable(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Method 
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public static void main(String[] args) {
		InstanceVariable student = new InstanceVariable("Boomika", 21);
		
		System.out.println("Student details: ");
		student.displayInfo();

	}

}
