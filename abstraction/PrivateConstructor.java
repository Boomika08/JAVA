package abstraction;

public class PrivateConstructor {
	
	private PrivateConstructor() {
		System.out.println("Private Constructor");
	} 
	
	
	public static void instanceMethod() {
		PrivateConstructor p = new PrivateConstructor();

	}
	
	public static void main(String[] args) {
		PrivateConstructor.instanceMethod();
	}

}
