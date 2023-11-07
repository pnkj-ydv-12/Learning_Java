package java__oops;

public class Animal {

	String name;
	int age;
	char gender;
	String color;
	
	public Animal(String name, int age, char gender, String color) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.color = color;
	}

	public void eat(){
		System.out.println("eating....");
	}
	
	public void sleep(){
		System.out.println("sleeping....");
	}

}
