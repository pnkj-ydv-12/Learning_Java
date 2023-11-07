package encapsulations;

public class Rectangle {
	
	int length;
	int breadth;
	public Rectangle(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}
	
	public void calculateArea(){
		int area=length*breadth;
		System.out.println("Area : "+area);
	}
	
	public void calculateParimap(){
		int parimap=2*(length+breadth);
		System.out.println("Parimap : "+parimap);
	}



	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(20,40);
			rectangle.calculateArea();
		 	rectangle.calculateParimap();
		 	
	}

}
