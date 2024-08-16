package task;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		double a = sc.nextDouble();
		System.out.println("Enter another number: ");
		double b = sc.nextDouble();
		
		System.out.println("Enter the operations: Add, Sub, Multiply and Divide");
		
		String operation = sc.next().toLowerCase();
		
		switch(operation) {
		case "add":
			System.out.println("Addition of two numbers: "+(a+b));
			break;
		case "sub":
			System.out.println("Subtraction of two numbers: "+(a-b));
			break;
		case "multiply":
			System.out.println("Multiplication of two numbers: "+(a*b));
			break;
		case "divide":
			System.out.println("Division of two numbers: "+(a/b));
			break;
		default:
			System.out.println("Invalid Operation");
		}
		sc.close();
	}

}
