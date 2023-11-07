package java__oops;

public class Human {
	
	String name;
	int age;
	int heightininches;
	String eyecolor;
	
	
	public Human(String name, int age, int heightininches, String eyecolor) {
		
		this.name = name;
		this.age = age;
		this.heightininches = heightininches;
		this.eyecolor = eyecolor;
	}

	public void speak(){
		System.out.println("Hello, My name is "+name);
		System.out.println("My current age is "+age);
		System.out.println("I'm "+heightininches+" inches tall");
		System.out.println("My eye color is "+eyecolor);
	}
	
	public void eat(){
		System.out.println("eating.....");
	}
	
	public void walk(){
		System.out.println("walking...... ");
	}
	

}

