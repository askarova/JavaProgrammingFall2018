package day25_arrays;

public class Day25ArraysWarmUpTask {
	public static void main(String[] args) {
		/*
		 * Create and array called kitchenItems
		   assign following values: knife, wooden spoons, 
		   plates, cups, forks, pan, pot
			trash can, fridge, dishwasher
		 */
		String[] kitchenItems = {"Knife", "wooden spoons ", 
				   " Plates ", "cups", " Forks", "pan", "pot",
					" trash can", "Fridge ", "dishWasher"};
		
		/*
		 * Using a for each loop iterate through each item:
			within your for each loop:
		 */
		for(String item : kitchenItems ) {
			//System.out.println(item);
			
			item = item.toLowerCase().trim();
			
			switch(item) {
			case "knife":
				System.out.println("Knife is used for cutting.");
				break;
			case "wooden spoons":
				System.out.println("Wooden spoon is used for teflon.");
				break;
			case "plates":
				System.out.println("Plates are used to serve food.");
				break;
			case "cups":
				System.out.println("Cups is used for putting drinks.");
				break;
			case "forks":
				System.out.println("Forks are used to eat food.");
				break;
			case "pan":
				System.out.println("Pans are used for (I don't know).");
				break;
			case "pot":
				System.out.println("Pot is used for cooking/storing food");
				break;
			case "trash can":
				System.out.println("Trash can is used for storing disposables.");
				break;
			case "fridge":
				System.out.println("Fridge is for storing food in a cold condition.");
				break;
			case "dishwasher":
				System.out.println("Dishwasher is used for washing dirdty dishes.");
				break;
			
		   }
	   }
	   
	   
	   
	   
   }
}
