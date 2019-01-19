package day28_Arrays05;

public class ArrayHas55 {
public static void main(String[]args) {
	
	int nums[]= {45,15,52,5,5};
	
	//check if 5 and 5 are in positions next to one another
	
	boolean found=false;
	
for(int i =0; i<nums.length; i++) {
	if(nums[i]== 5 && nums[i+1]==5) {
		found =true;
		break;
		
	}
}
	System.out.println(found);
	
	
	}
}

