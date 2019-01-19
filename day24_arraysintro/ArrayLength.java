package day24_arraysintro;

public class ArrayLength {
    public static void main(String[]args) {
    	//declare array names that store 5 names
    	
    	String[]names =new String[5];
    	names[0]= "Serik";
    	names[1]="Sia";
    	names[2]="Zee";
    	names[3]="Erkam";
    	names[4]="Zarina";
    	
    	System.out.println(names.length);// count of values in array
    	System.out.println(names[4]);
    	//String name and assign Sia to it by reading from array
    	
    String name= names[2];
    System.out.println(name.length());// count of characters in atring
    	
    	
    }
}
