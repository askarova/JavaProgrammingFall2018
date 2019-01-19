package replIt;

public class MatchMultyArray {

	
		public static void main(String[] args) {
			
			/*
			 * You get a 2d array and you need to find how many two matches there are.
			 * and return the number(int) of matches you found.
			 * For example : 1 and 2 are not a match, 2 and 2 are a match.
			 * a match in this case is two numbers in a row that are equal .
			 * for example:
			 * [2,2,1,3,4,5]
			 * [5,2,3,3,4,5]
			 * [3,2,3,1,4,5]
			 * 
			 * print
			 * matches: 2
			 * 
			 * This 2d array has 2 matches (the 2,2 in the first row and 3,3 in the second).
			 * hint: you will need a nested for loop to loop all the array. 
			 * in the if check the if the current number is equal to the next 
			 * (or previous it doesn't matter), check for array boundaries before 
			 * so you won't get an error.
			 */
		
			
			int[][] arr = {{3, 3, 1}, {1, 2, 3, 3, 1, 4, 4, 4}};
			
			int matches = 0;
			
			System.out.println(arr.length);
			
			for (int outer = 0; outer < arr.length; outer++) {
				for (int inner = 0; inner < arr[outer].length-1; inner++) {
					
					if(arr[outer][inner] == arr[outer][inner+1]) {
						matches += 1;
						inner++;
						
					}
					
				}
			}
			System.out.println("matches: " + matches);
		}
	}

