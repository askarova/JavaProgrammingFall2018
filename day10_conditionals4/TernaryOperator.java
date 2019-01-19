package day10_conditionals4;

public class TernaryOperator {
     public static void main(String[]args) {
    	 
    	 //mas score 100. Passing score is 60
    	 
    	 int score= 50;
    	 String status;
    	 
    	 
    	 if(score >=60) {
    		 status ="pass";
    	 }else {
    			 status ="fail";
  
    		 }
    		 
    	 status =(score >=60)?"pass": "fail";
    	 
    	 System.out.println(status);
    	 
    //boolean variable express
    // if true-> shipping = 25
    // if false ->shipping =15
    	 
    	 boolean express= true;
    	 
    	int shipping= (express) ?25 :15;
    	 
    	 
    	System.out.println(shipping);
    		 
    	 }
    	 
    	 
    	 
    	 
    	 
    	 }
     
     
     
     
     

