package day25_arrays;

public class CountMatches {
  public static void main(String[]args) {
	  
//create a doublle array called prices	  
//assign 10 or more different prices	  
//using a loop count how many items that is more than &20	  
//print the count
//if no price was found that is more tham &20 then print
	// no items that costs more than &20
	  
double[]prices= {12.40,20.9,21.7,56.49,5.55,6.0,10.99,20.99,25.99,99.99};

	  int count =0;
	  for (double price : prices) {
		  if(price >20.0) {
			  count++;
		  }
	  }
	  
	  if(count ==0) {
		  System.out.println("No items for more than $20");
	  }else {
	  }
		System.out.println(count + " items with more than $20");
		
		  
	  
  }
}
