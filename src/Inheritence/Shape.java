package Inheritence;

public class Shape {
	
	String color;
	
	public void shape(){
		System.out.println("Geometry Concepts");
		System.out.println("this shape is in " +this.color);
	}

	public static void main(String[] args) {
		Triangle T1=new Triangle();
		T1.color="red";

        T1.shape();
        
	}

}
