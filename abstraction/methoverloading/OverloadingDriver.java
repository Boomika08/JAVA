package methoverloading;

//driver class
public class OverloadingDriver {
	
	public static void main(String[] args) {
		//helper class1
		OverloadingHelper ob = new OverloadingHelper();
		
		int prod1 = ob.multiply(1,2);
		System.out.println("Product of two integer values: "+prod1);
		
		int prod2 = ob.multiply(1,2,3);
		System.out.println("Product of three integer values: "+prod2);
		
		//helper class2
		OverloadingHelper1 ob1 = new OverloadingHelper1();
		
		int add1 = ob1.addition(12, 8);
		System.out.println("Addition of two numbers: "+add1);
		
		double add2 = ob1.addition(2.46548, 2.64927);
		System.out.println("Addition of two numbers is "+add2);
	}

}
