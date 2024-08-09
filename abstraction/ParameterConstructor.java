 package abstraction;

public class ParameterConstructor {
	//instance variable should be private
	private String name;
	private int age;
//	private double salary;//no use of this instance variable, but it can run the program
	
	public ParameterConstructor(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
	}
	
	public static void main(String[] args) {
		ParameterConstructor s = new ParameterConstructor("Boomi",20);
		s.display();
		ParameterConstructor s1 = new ParameterConstructor("Kousi",22);
		s1.display();
	}

}
