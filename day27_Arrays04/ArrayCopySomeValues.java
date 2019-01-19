package day27_Arrays04;

public class ArrayCopySomeValues {
   public static void main(String[]args) {
	   
	   
	   String[]arr= {"zero","one","two","three","four","keys"};
	   
	   String[]fewValue;
	   
	   int counter =0;
	   for(String str:arr) {
	   if(str.contains("e")) {
		   counter++;
	   }
   }
	   System.out.println(counter);
	   String[]fewValues =new String[counter];
	   
	   int i =0;
	   
	   for(String each:arr) {
		   if(each.contains("e")) {
			   fewValues[i]=each;
			   i++;
			   
		   }
	   }
	   
	   for(String val:fewValues) {
		   System.out.println(val +" ");
	   }
   }
   
}

