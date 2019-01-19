package day26_arrays03;

public class GetUniqueValuesFromArray {
      public static void main(String[]args) {
    	  
   int []nums = {1,2,3,4,2,3,4,44,12,20,100,33,100,4};
   
   for(int outer =0; outer < nums.length;outer ++) {
	    int currentNum= nums[outer];
	    boolean duplicate=false;
	    
	for(int inner=0; inner <nums.length;inner++) {
		if(nums[inner]==currentNum && outer!= inner) {
			duplicate=true;
			break;
			
		}
	}
	if(duplicate==false) {
		System.out.print(currentNum+" ");
	}
   
   
   }
      }
}

      
   
	   
   
      

