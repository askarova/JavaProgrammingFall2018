package replIt;



import java.util.ArrayList;

	public class DeliveryCalculator {

		public static void main(String[] args) {
			
	/*
 * A pizza delivery men has a scooter an a lot of deliveries to make, he will have to refuel a few times.

refuel_times gets an arraylist deliveries of the amount of fuel it will take to get to destinations like:
[1,3,5], first place will take 1 fuel unit to get to second 3 fuel units etc...
the max_fuel is the max fuel units in the vehicle fuel tank.
you will need to returns how meany refuels it will take to do all deliveries (if the units are bigger then the tank he will refuel along the way in a gas station).
			
for example:
			
refuel_times([7,7,7],7) //21%7 = 0 
returns:3 (3 fuel stops 7 units each delivery)
			
refuel_times([9,1],3) // fuel stops -> 4 -> 12units ; 3 -> 9units  10   
returns:4 (3 fuel stops for first delivery and +1 stop for second)
			
refuel_times([100,200,10],10)
returns:31
*/
			
			ArrayList <Integer> del = new ArrayList<>();
			del.add(9);
			del.add(1);
			
			System.out.println(refuel_times(del,3));
		}
		
public static int refuel_times (ArrayList<Integer> deliveries,int max_fuel) {
			int count = 0;
			int sum = 0;
			
			for (int i =0; i<deliveries.size(); i++) {
				sum+=deliveries.get(i); //10
			}
			
			if (sum%max_fuel == 0) {
				count = sum/max_fuel;
			}else {
				count = sum/max_fuel +1;
			}
			
			return count; 
		}
		
	
}
