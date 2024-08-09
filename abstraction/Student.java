package abstraction;

public class Student {
	private String name;
	private int rollNumber;
	private double marks;
	
	public Student() {
		this.name = "Kumari";
		this.rollNumber = 2039476587;
		this.marks = 98;
	}
	
	public Student(String name, int rollNumber, double marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	
	public void details() {
		System.out.println("Student Name: "+name);
		System.out.println("Student Roll Number: "+rollNumber);
		System.out.println("Student Marks: "+marks);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.details();
		Student s1 = new Student("Boomika", 2106201040, 91.5);
		s1.details();
		s1 = new Student ("Kousika", 2106201245, 95.5);
		s1.details();
	}

}
