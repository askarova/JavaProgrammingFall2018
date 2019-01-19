package day10_conditionals4;

public class PriceChecker {
   public static void main(String[]args) {
	   
	   //item -> 1-50 -> cheap
	   // item -> 50-100 -> expensive
	   //-> not buying
	   
	   int price =55;
	   String status;
	   
	   if(price >= 1 && price <= 50) {
		  status ="Cheap";  
	   }else {
		   if(price >= 51 && price <= 100) {
			   status ="Expensive";
	   }else {
			   status ="Not buying";
			   
		System.out.println("Status with If:" + status);
		status =(price >=1 && price <=50)?"Cheap":
			(price >51 && price <=100)? "Expensive": "Not buying";
		
		System.out.println("Status with ?: " + status);
		   }
	   }
   }
}
