package functionsandmethods;

import java.util.Scanner;

public class PrimeOrNot {
	
	public static void isPrimeOrNot(int n){
		if(n==0||n==1){
			System.out.println("please enter the number which is greater than 2");
		}else{
			int i,f=0;
			for(i=2;i<=n;i++){
				if(n%i==0){
					f++;
				}
				}
			if(f==1){
				System.out.println("Number is prime");
			}else{
				System.out.println("Number is not prime");
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		
		isPrimeOrNot(n);

	}

}
