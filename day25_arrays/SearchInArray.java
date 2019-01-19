package day25_arrays;

public class SearchInArray {
   public static void main(String[]args) {

//create array nums and assign 10 different number to it
//seatrch for a number 100 in it using a loop,once found print the index
//location and value"value at index +"index"
// if that search value is not found print"100 not found in the array"
//once you find 100 then exit the loop at that point, we are looking 
	   //for first 100 not all of them
	   
	   int []nums= {20,10,35,50,44,90,80,70,100,55};
	   
	   int lookfor =100;
	   boolean found =false;
	   
	   for(int i=0; i<nums.length; i++) {
		   
	   if(nums[i]==lookfor) {
		   System.out.println(lookfor+ " was found at index " + i);
		   found=true;
		   break;

	   }
   
	   }
	   
	   if(!found == false) {
		System.out.println(lookfor + " not found");
		
	   }
   }
}


