package day24_arraysintro;

public class PrintArrayValues {
  public static void main(String[]args) {
	  //create an array cars and directly assign values
	  //,Moskvich,Audi,Porsche, BMW, Honda, Tesla, Dodge, Kia, Acura, Fiat
	  
	  String[]cars=new String[]{"Moskvich","Audi","Porsche", "BMW", "Honda", "Tesla", 
		                        "Dodge", "Kia", "Acura", "Fiat","Cooper",""};
		//print number of cars
	  System.out.println(cars.length);
		   
	  int i=0;
	  System.out.println(cars[i]);
	  i++; 
	  System.out.println(cars[i]);
	  i++;
	  System.out.println(cars[i]);
		                        
	// print all values using a for loop
	  for(int idx=0; idx < cars.length; idx++) {
		  
	  System.out.println(cars[idx]);
  }
	  System.out.println("----For EACH LOOP----");
	  //print all values using a for each loop
	  for(String car : cars) {
		  System.out.println(car);
	  }
	  
	  int []nums = {4,6,3,1,4};
	  for(int n :nums) {
		  System.out.println(n);
		 
	  }
	  
	  
	  
	  
  }
  }
  
