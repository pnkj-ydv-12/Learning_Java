package classesandobjects;

public class Pen {
	
	String color;
	String type;
	
	public void work(){
		System.out.println("Writing something");
		}
	public void color(){
		System.out.println(this.color);
	}
	

	public static void main(String[] args) {
		
		Pen pen1=new Pen();
		pen1.color="Black";
		pen1.type="Gel";
		
		Pen pen2=new Pen();
		pen2.color="Blue";
		pen2.type="BallPoint";
		
		pen1.work();
		pen2.color();
	}
}
