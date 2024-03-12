package java_loops;

public class WhileLoopPractice {

	public static void main(String[] args) {
		
		int count=0;
		while(count<=100){
			System.out.println("Pankaj is here...." +count);
			
			count =count+1;
			
			if(count == 25){
				System.out.println("stop");
				break;
			}
			
		}

	}

}
