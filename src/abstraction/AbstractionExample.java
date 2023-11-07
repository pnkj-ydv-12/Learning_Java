package abstraction;


abstract class Animal{
	
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public abstract void makeSound();
	
	public String getName(){
		return name;
	}
	
}

 class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	
	public void makeSound(){
		System.out.println(getName()+" Barks ");
	}
	
}
 class Cat extends Animal{

		public Cat(String name) {
			super(name);
		}
		
		public void makeSound(){
			System.out.println(getName()+" Meow ");
		}
		
	}



public class AbstractionExample {

	public static void main(String[] args) {
		Animal myDog=new Dog("Buddy");
		Animal myCat=new Cat("Sushma");
		
		myDog.makeSound();
		myCat.makeSound();
		

	}

}
