package classesandobjects;

public class Student1 {
	
	String name;
	int age;
	
	public void getinfo(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	/*Student1(String name,int age){
		this.name=name;              //Parameterized Constructor
		this.age=age;	
	}
     */
	Student1(Student1 s3){
		this.name=s3.name;            //Copy Constructer
		this.age=s3.age;
	}
	
	Student1(){
		
	}
	
	public static void main(String[] args) {
		
	//	Student1 s1=new Student1("aman",24);
   //   s1.getinfo();
		
		Student1 s2=new Student1();
		s2.name="Rohit";
		s2.age=18;                            //copying........
		
		Student1 s3=new Student1(s2);
	    s3.getinfo();

	}

}
