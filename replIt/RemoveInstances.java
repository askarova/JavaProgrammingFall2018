package replIt;

import java.util.ArrayList;

	public class RemoveInstances {
		
		public static void main(String[] args) {
			
			/*
 * This method gets an arraylist of Integers and a number(Integer).it returns an arraylist.

It removes any instance of the number it gets from the arraylist.
			
for example:
			
removeInst([1,1,2,3,1,4],1)
returns: [2,3,4]
			
removeInst([3,4,3,3],4)
returns: [3,3,3]

*/
			ArrayList <Integer> nums = new ArrayList<>();
			nums.add(1);
			nums.add(1);
			nums.add(2);
			nums.add(3);
			nums.add(1);
			nums.add(1);
			nums.add(4);
			System.out.println(removeInst(nums, 1));
			
		}

public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) {
			
			
			//[1,1,2,3,1, 1,4] , 1
			// 0 1 2 3 4 5
			// i = 0 1 2 3
			//[1,2,3,1,4]
			// 0 1 2 3 4
			//[2,3,1,4]
			// 0 1 2 3
			//[2,3,4]
			// 0 1 2 
			//[1,2,3,4]
			// 0 1 2 3 
			
			
			
	for (int i = 0; i< r.size(); i++) {
				if (r.get(i) == n) {
					r.remove(i);
					i--;
				}
			}
			
			return r;
		}
		
	}

