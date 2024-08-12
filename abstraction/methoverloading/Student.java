package ConstructorOverloading;

class StudentDetail{
	
	public StudentDetail(int roll_no, String name) {
		System.out.println("Roll No:"+roll_no);
		System.out.println("Name: "+name);
	}
	public StudentDetail(int roll_no, String name, int age) {
		System.out.println("Roll No:"+roll_no);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	public StudentDetail(int roll_no, String name, int age, int subject) {
		System.out.println("Roll No:"+roll_no);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Subject: "+subject);
		
	}
}


public class Student {
	public static void main(String[] args) {
		StudentDetail s = new StudentDetail(1, "Boomika");
		StudentDetail s1 = new StudentDetail(2, "Kumari",90);
		StudentDetail s2 = new StudentDetail(3, "Kousika",89,90);
	}

}
