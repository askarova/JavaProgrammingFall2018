package day6_operators_boolean;

public class IncrementDecrementOperators {
      public static void main(String[]args) {
	
  int windowsComputers =35;
  windowsComputers++;// add one
  windowsComputers++;
  System.out.println(windowsComputers);
  
  windowsComputers= windowsComputers +1;//long way
 
  System.out.println(windowsComputers);
  
  int unreadMessages= 50;
  System.out.println("Unread messages:" + unreadMessages);
  System.out.println("Reading one message ");
  
  unreadMessages--;
  System.out.println("Unread messages:" + unreadMessages);
  
  
}
}
