package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		//Arrays of integers.
		int[] values;	
		values = new int[100];
		
		values[0]=1000;
		values[2]=1010;
		values[10]=1050;
		values[51]=9999;
		values[99]=99999;
		
		System.out.println(values[99]);
		
		//Arrays of String.
		String[] words = new String[5];
		words[0]="soldiers";
		words[1]="horses";
		words[2]="chariots";
		words[3]="weapons";
		
		System.out.println(words[2]);
		
		
		

	}

}
