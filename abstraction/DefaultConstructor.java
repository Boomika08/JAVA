package abstraction;

public class DefaultConstructor {
	//Default Constructor
	public DefaultConstructor() {
		//initialization code
		System.out.println("Default Constructor has no arguments");
	}
	public static void main(String[] args) {
		//constructor is invoked while creating an object of class
		DefaultConstructor object = new DefaultConstructor(); 
	}

}
//package abstraction;
//
//public class DefaultConstructor {
//	//Default Constructor
//	private String name;
//	private int age;
//	
//	public DefaultConstructor() {
//		//initialization code
//		System.out.println("Default Constructor has no arguments");
//	}
//	
//	public void display() {
//		System.out.println("Name: "+this.name);
//		System.out.println("Age: "+this.age);
//	}
//	
//	public static void main(String[] args) {
//		//constructor is invoked while creating an object of class
//		DefaultConstructor object = new DefaultConstructor(); 
//		object.display();
//	}
//
//}