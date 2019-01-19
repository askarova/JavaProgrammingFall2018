package replIt;

public class ConvertionCalculator {

	
	public static void main(String[] args) {
			
		/*
		* for example:
			convertC([["drachma","11.0"],["sek","5.0"]]   ,   [["drachma","0.6"],["sek","100"]]);
			returns: 1103
			(Bob has 11.0  drachma and 5.0 Sek currency money and he needs to convert them to USD. Conversion rates are in second array. So we multiple (11.0 * 0.6) +(5.0 * 100) and return the result    )
			
			convertC([["yen","5.0"],["frank","5.0"]]   ,   [["yen","1"],["frank","1"]]);
			returns: 10
			
			hint: use  
			Double.parseDouble(text);
			to convert string to double
			
			return:
			the sum of all currencies in dollars as a double.
			
			[
				["euro","1.5"],
				["yen","21.5"],
				["mark","100.0"]
				]
				
				[
				["euro","0.003"],
				["yen","0.5"],
				["mark","0.87"]
				["frank","1"]
				]
			 */
			
		}

public static  double convertC(String[][] money,String[][] convertionRate) {
	double dollars = 0;
			
	for (int i = 0; i < money.length; i++) {
	for (int j = 0; j<convertionRate.length; j++) {
		if (money[i][0].equalsIgnoreCase(convertionRate[j][0]))	{
dollars += Double.parseDouble(money[i][1]) * Double.parseDouble(convertionRate[j][1]);
						break;
					}			
				}
							
			}
			
			return dollars;
			
		}
		
		
		
		
		
	}

