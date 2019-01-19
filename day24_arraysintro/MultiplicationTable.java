package day24_arraysintro;

public class MultiplicationTable {
   public static void main(String[]args) {
	   
	   for(int outer =1; outer <=10; outer++) {
		   System.out.println("\t"+outer);
		 System.out.println("------------"); 
		   
		for(int inner =1; inner <=10;inner++) {
			int result=outer*inner;
			
			System.out.println("|"+outer +"x"+inner +"="+result+ "\t|");
			
		}
		System.out.println("------------"); 
		    
	   }
	   
			  
			   
			   
			 
	   }
   
}

