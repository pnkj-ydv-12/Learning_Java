package Polymorphism;

class Triangle extends Shape{
	
	private int base;
	private int height;
	
	Triangle(int base, int height) {
		this.base=base;
		this.height=height;
	}

	public void draw() {
		System.out.println("Drawing Triangle");
	}
	
	public int calculateArea() {
		int area = (1/2) * base * height;
		return area;
	}
 }
