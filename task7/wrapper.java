package task;

public class wrapper {

	public static void main(String[] args) {
		//int to their class type
		int b=10;
		Integer wrap = Integer.valueOf(b);
		Integer j = b;

		System.out.println(b+" "+wrap+" "+j);
		
		//boolean to their class type
		boolean c=true;
		Boolean wrap1 = Boolean.valueOf(c);
		Boolean k = c;

		System.out.println(c+" "+wrap1+" "+k);
	}

}
