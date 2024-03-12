package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		
		//Example 1.
		boolean hungry;
		
		if(hungry=true){
			System.out.println("I am starving......");
		}else{
			System.out.println("I am all full");
		}
		
		
		//Example 2;
		int hungerRating = 4;
		if(!(hungerRating<=6)){
			System.out.println("I am not hungry");
		}else{
			System.out.println("I am hungry");
		}
		
		//Example 3;
		
		int currentTemp = 78;
		int fvrtTemp = 52;
		String opinion;
		
		if(currentTemp>=(fvrtTemp+50)){
			opinion = "i will not survive in this temperature.";
		}else if(fvrtTemp>=currentTemp){
			opinion = "It's to cold outside. ";
		}else{
			opinion = "it's a beautiful day";
		}
		System.out.println(opinion);
		
	    //Switch case
		int month=6;
		String monthString;
		
		switch(month){
		
		case 1 : monthString="January";
		         break;
		case 2: monthString="February";
		         break;
		case 3 : monthString="March";
		         break;
		case 4 : monthString="April";
		         break;
		case 5 : monthString="May";
		         break;
		case 6 : monthString="June";
		         break;
		case 7 : monthString="July";
		         break;
		
		default : monthString="Not Available";
		}
		System.out.println(monthString);
	}

}
