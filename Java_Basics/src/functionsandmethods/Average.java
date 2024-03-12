package functionsandmethods;

import java.util.Scanner;

public class Average {
	
	public static void printAverage(int a,int b,int c){
		int avg=(a+b+c)/3;
		System.out.println("Average of these three number = "+avg);
		return;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		printAverage(a,b,c);
		
	}

}
