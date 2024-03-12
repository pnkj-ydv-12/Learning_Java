package java_loops;

public class Assignment1 {

	public static void main(String[] args) {
		
		String str= "We have a large inventory of things in our warehouse falling in "
				+ "the category:apperal and the slightly "
				+ "more in demand category:makeup along with the category:furniture and ...";
		
		printCategories(str);

	}
	
	public static void printCategories(String str1){
		int i=0;
		while(true){
			int found=str1.indexOf("category:",i);
			if(found==-1)break;
			int start=found+9;
			int end=str1.indexOf(" ",start);
			System.out.println(str1.substring(start,end));
			i=end+1;
		}
		
	}

}
