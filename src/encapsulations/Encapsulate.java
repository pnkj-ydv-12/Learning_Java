package encapsulations;

public class Encapsulate {
	
	private String myName;
	private int myAge;
	private int myId;
	
	//get method for name, age and id to access

	public String getName(){
		return myName;
	}
	
	public int getAge(){
		return myAge;
	}
	
	public int getId(){
		return myId;
	}
	
	//set method for name,age and id to access
	
	public void setName(String newName){
		myName=newName;
	}
	
	public void setAge(int newAge){
		myAge=newAge;
	}
	
	public void setId(int newId){
		myId=newId;
	}


	public static void main(String[] args) {
		
		Encapsulate obj=new Encapsulate();
		obj.setName("Pankaj");
		obj.setAge(24);
		obj.setId(2107207);
		
		System.out.println("My Name is : "+obj.getName());
		System.out.println("My Age is : "+obj.getAge());
		System.out.println("My Name is : "+obj.getId());
		

	}

}
