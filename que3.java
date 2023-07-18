package com.gurukul.Homework;

import java.util.Scanner;

public class que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter Year");
	    int days=sc.nextInt();
	    int year=days/365;
        
	     int month=(days-year*365)/30;
	     
	    int week=(days-year*365-month*30)/7;
        // System.out.print(week);
	  
	     int day=(days-year*365-month*30-week*7);
      //System.out.print(day);
	System.out.print(year+"Years :"+ month+"Months :"+week+"Weeks :" +day+"Days");
       
 
	}

}
