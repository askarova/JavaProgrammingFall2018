package day24_arraysintro;

public class ArraysCreation {
   public static void main(String[]args) {
	   int[]numbers =new int[5];
	   
	   numbers[0]=234;
	   numbers[1]=432;
	   numbers[2]=100;
	   numbers[3]=54;
	   numbers[4]=7654;
	   System.out.println(numbers[0]);
	   System.out.println(numbers[3]);
//declare a char array grades and assign A,B,C,D,E to it
// use any one of 3 ways to do so
   
char[]grades=new char[5];
 
 grades[0]='A';
 grades[1]='B';
 grades[2]='C';
 grades[3]='D';
 grades[4]='E';
 
//2 way-> char[] grades=new char[] {'A','B','C','D','E'};
//3 way -> char[]grades= new char[]{'A','B','C','D','E'}; 
 
 //print first item
 
 System.out.println(grades[0]);
 
 char myGrade = grades[1];
 System.out.println(myGrade);
 
 //String[]cities= new String[3];
 
 String[]cities;
 cities= new String[3];
 
 cities[0]="Washungton";
 cities[1]="New York";
 cities[2]="Los Angeles";
 
		 
 
   }
   
 }

 
 
 
 