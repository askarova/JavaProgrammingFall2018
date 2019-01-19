package replIt;

public class MergeWithTheString {

	
		
public static void main(String[] args) {
			
/*
* When gears merge and work together, one teeth from each one goes in order.
* 	Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.   Please note one and two can be of different lengths. Please look at below examples:
				
		s1 ==> "12345"
		s2 ==> "abcde"
		mergeStrings(s1,s2) ==> "1a2b3c4d5e"
				
		mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
				
		mergeStrings("java", "selenium") ==> "jsaevlaenium"
			 */
			
		}
		
public static String Merged (String word1, String word2) {
String merged = "";
			
	if (word1.length()>word2.length()) {
				
	for (int i = 0; i<word1.length(); i++) { // wooden spoon
		merged += word1.charAt(i); //wsopoodoenn
					
	if (i<word2.length()) {
		merged += word2.charAt(i);
					}
				}
			} else {
				for (int i = 0; i<word2.length(); i++) { 
					merged += word2.charAt(i); 
					
					if (i<word1.length()) {
						merged += word1.charAt(i);
					}
				}
			}
			
			return merged;
		}

	}

