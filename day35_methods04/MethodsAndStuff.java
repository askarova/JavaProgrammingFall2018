package day35_methods04;

public class MethodsAndStuff {
	
	public static void main(String[] args) {
		String str1 = "halloweenn";
		String str2 = "enn";

		int count = numberOfOccurences(str1, str2);
		System.out.println(count);
	}

	/*
	 * given a string, write a method which returns how many times a certain string
	 * appears on another string
	 */
	public static int numberOfOccurences(String str1, String str2) {
		int count = 0;
		for (int i = 0; i < str1.length() - str2.length() ; i++) {
			String current = str1.substring(i, i + str2.length());
			if (current.equals(str2)) {
				count++;
			}
		}
		return count;
	}

	/*
	 * delete utility will delete a given character from the given string
	 * 
	 */

	public static String delete(String str1, String str2) {
		String newOne = str1.replace(str2, "");
		return newOne;
	}

}




