package Polymorphism;

public class Test {
	
	public static void showDetails(Shape shape) {
		shape.draw();
		
		int area = shape.calculateArea();
		System.out.println(" Area : " + area);
	}

	public static void main(String[] args) {
		
		Shape triangle = new Triangle(5,20);
		Shape ractangle = new Ractangle(5,10);
		Shape circle = new Circle(20);
		
		showDetails(triangle);
		showDetails(ractangle);
		showDetails(circle);
		
	}

}
