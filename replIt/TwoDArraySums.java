package replIt;

import java.util.Arrays;

public class TwoDArraySums {
	
	
	
	    public static void main(String[] args) {
	        
	        int [][] nums1 = {
	                        {1, 2, 37},
	                        {8, 6, 0},
	                        {7, 5, 3}
	                        };
	        int [][] nums2 = {
	                        {8, 0, -1},
	                        {7, 3, 0},
	                        {1, 8, 9}
	                        };
	        
// create a new 2D array in which every value will be the sum of 2 corresponding 
//elements in 2 given 2D arrays
	        
	        int [][] sum = new int [3][3];
	        
	        for (int i = 0; i < sum.length; i++) {
	            for (int j = 0; j < sum[i].length; j++) {
	                sum[i][j] = nums1[i][j] + nums2[i][j];
	            }
	            System.out.println(Arrays.toString(sum[i]));
	        }
	        
	    }
	    
	}



