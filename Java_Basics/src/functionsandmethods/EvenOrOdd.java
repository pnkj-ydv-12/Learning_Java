package functionsandmethods;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void isEvenOrOdd(int n){
		
		if(n%2==0){
			System.out.println("given number is even");
		}else{
			System.out.println("number is odd");
		}
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		isEvenOrOdd(n);

	}

}
