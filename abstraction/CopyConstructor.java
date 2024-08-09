package abstraction;

public class CopyConstructor {
	//instance variable should be private
	private String name;
	private int age;
//	private double salary;//no use of this instance variable, but it can run the program
	
	public CopyConstructor(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public CopyConstructor(CopyConstructor c) {
		this.name = c.name;
		this.age = c.age;
	}
	
	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
	}
	
	public static void main(String[] args) {
		CopyConstructor s = new CopyConstructor("Boomi",20);
		s.display();
		CopyConstructor s1 = new CopyConstructor("Kousi",22);
		s1.display();
		
		CopyConstructor copiedconstructor = new CopyConstructor(s);
		copiedconstructor.display();
	}

}
