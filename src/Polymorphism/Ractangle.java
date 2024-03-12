package Polymorphism;

public class Ractangle extends Shape{
	
	private int breadth;
	private int width;
	
	Ractangle(int breadth, int width){
		this.breadth = breadth;
		this.width = width;
	}
	
	public void draw() {
		System.out.println("Drawing Ractangle");
}
	
	public int calculateArea() {
		int area = breadth * width;
		return area;
}
}