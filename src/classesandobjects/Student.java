package classesandobjects;

public class Student {
	
	String name;
	int age;
	
	public void getinfo(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.name="Prem";
		s1.age=19;
		s2.name="Raj";
		s2.age=17;
		
		s1.getinfo();
		s2.getinfo();
	}

}
