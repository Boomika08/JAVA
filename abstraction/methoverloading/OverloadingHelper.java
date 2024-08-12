package methoverloading;

public class OverloadingHelper {
	public int multiply(int a,int b) {
		int prod = a*b;
		return prod;
	}
	
	public int multiply(int a,int b,int c) {
		int prod = a*b*c;
		return prod;
	}
}


