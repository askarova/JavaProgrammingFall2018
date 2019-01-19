package day38_wrapperclasses_stringbuilder;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingVSUnBoxing {
	public static void main(String[]args) {
		
// auto boxing. take primitive and convert into Wrapper class object
	
	int i = 1000;
	Integer j = i;
	
	Double d = 34.2;
	
	boolean b = true;
	Boolean b2= b;
	

	List<Integer> nums = new ArrayList<>();
	nums.add(433);
	int p = 555;
	nums.add(p);
	nums.add(new Integer (77));
	System.out.println(nums);
	// unboxibg-> taking the wrappaer class object and converting to
	// primitive and it happens automarically
	
	int r = nums.get(0);
	
	Boolean bool = new Boolean(false);
	boolean boolPrim = bool;
 
	System.out.println(boolPrim);
	
	Character chObj= '^';// autoboxing from char-> Character object
	char myChar = '#';
	Character chObj2= myChar;// autoboxing from char-> Character
	
	char chPrim = chObj;// un=boxing Character object->char primitive
	Character char3= new Character('_');// no boxing, just create Character object
	
	char ch7=char3; //take char3 Character object and unbox to char primitive and 
	                //assign to ch7
	
	Integer intValue= new Integer(400);
	int intPrimitive =400; 
	
	if(intValue== intPrimitive) {
		System.out.println("pass");
	}else {
		System.out.println("fail");
	}
	

}
}