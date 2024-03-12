package java_basics;

import someotherpackage.ExampleClass;
public class LearningMethods {

	public static void main(String[] args) {
		
		System.out.println("Hello, Pankaj is here...");
		System.out.println(MyUtils.printsomejunk("What is your current weight."));
		MyUtils.printsomejunk(74);
		MyUtils.add2Numbers(23,76);
		int var = MyUtils.add10(57);
		System.out.println("value after adding 10 is = " +var);
		ExampleClass.dosomething(9929);
	}
	
}
