package functionsandmethods;

import java.util.Scanner;

public class Function {
	
	//Multiply 2 Numbers.
	
	public static int multiply(int a, int b){
		
		return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
	    int a=sc.nextInt();
		int b=sc.nextInt();
		
		int result= multiply(a,b);
		System.out.println(result);

	}

}
