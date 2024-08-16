package task;

public class StaticVariable {
		    // Static variable
		    static int stat = 100;

		    public static void main(String[] args) {
		        System.out.println("Value of static variable: "+stat);

		        // Calling another method
		        anotherMethod();
		        System.out.println("Value of static variable after declaring another method: "+stat);
		    }

		    public static void anotherMethod() {
		        // Modifying the static variable
		    	stat=120;
	}

}
