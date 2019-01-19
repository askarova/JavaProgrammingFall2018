package day11_switchcase;

import java.util.Scanner;

public class CheckClass {
public static void main(String[]args) {
	

	// write a program  called checkClass
	//we have a day with a number in it and we check what day it is
	//String classAtSchool = "Group project"
	//String WeekdayName="Monday"
	//day 1-> classAtSchool ="Group Project"
	          //WeekdayName= "Monday"
	//day 2-> classAtSchool ="Java"
	          //WeekdayName= "Tuesday"
	
	//Print message ->it is Tuesday and Java class
	
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter Day : ");
	
	int day =scan.nextInt();
	
	String classAtSchool="" , weekDayName="";
	
	if(day==1) {
		classAtSchool ="Group Project";
		weekDayName= "Monday";
	}else if(day==2){
		classAtSchool ="Java programming";
		weekDayName= "Tuesday";
	}else if(day==3){
		classAtSchool ="Java programming";
		weekDayName= "Wednesday";	
	}else if(day==4){
		classAtSchool ="Manuel QA/SDLC";
		weekDayName= "Thursday";	
	}else if(day==5){
		classAtSchool ="No class";
		weekDayName= "Friday";	
	}else if(day==6){
		classAtSchool ="Java programming";
		weekDayName= "Saturday";	
	}else if(day==7){
		classAtSchool ="Java programming";
		weekDayName= "Sunday";	
	}else {
		System.out.println("ERROR: Invalid Day");
	}
	
		
	System.out.println("Day of Week : " + weekDayName+ "\n"+
		   "Class: "+ classAtSchool);
		
		
		
		
		
		
	}
	}
	

