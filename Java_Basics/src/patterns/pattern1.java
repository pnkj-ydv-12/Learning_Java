package patterns;

import java.util.Scanner;

public class pattern1 {
	
	public static void makingPattern1(int n){
		
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				System.out.print("*");
				}
			System.out.println("");
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
		makingPattern1(n);
	}

}
