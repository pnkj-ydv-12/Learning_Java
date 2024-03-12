package Polymorphism;

public class Circle extends Shape {
	
	private int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("Drawing Circle....");
	}
	
	public int calculateArea() {
		int area = radius*radius;
		return area; 
	}
	

}
	


