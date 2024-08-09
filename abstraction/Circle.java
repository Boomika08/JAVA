package abstraction;

public class Circle {
	private int radius;
	private String color;
	
	//default constructor
	public Circle() {
		this.radius = 1;
		this.color = "red";
	}
	
	//parameterized constructor initialization
	public Circle(int radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	//copy constructor
	public Circle(Circle copy) {
		this.radius = copy.radius;
		this.color = copy.color;
	}
	
	public void getInput() {
		//color and radius
		System.out.println("Color of the circle is "+color);
		System.out.println("Radius: "+radius);

	}
	
	public void getArea() {
		//perimeter, diameter and area
		System.out.println("Perimeter of the Circle is "+2*Math.PI*radius);
		System.out.println("Diameter of the Circle is "+2*radius);
		System.out.println("Area of the Circle is "+Math.PI*radius*radius);
	}
	
	public static void main(String[] args) {
		System.out.println("Displaying Circle color, radius, perimeter and its area:");
		//default constructor
		Circle c = new Circle();
		c.getInput();
		c.getArea();
		//parameterized constructor
		c = new Circle(5, "white");
		c.getInput();
		c.getArea();
		//copy constructor
		Circle copied = new Circle(c);
		copied.getInput();
		copied.getArea();
	}

}
