package functionsandmethods;

import java.util.Scanner;

public class Factorial {
	
	public static void factorial(int n){
		
		if(n<0){
			System.out.println("Invalid Number");
		}
		
		int factor = 1;
		
		for(int i=n;i>=1;i--){
			
			factor=factor*i;
		}
		
		System.out.println(factor);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
				
		factorial(n);

	}

}
