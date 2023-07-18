package com.gurukul.Homework;

import java.util.Scanner;

public class que7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Enter a Number");
		    int time=sc.nextInt();//2350
		    
		    int min=time%100;
		    String ap;
		    
		    if(time>1200)
		    	ap="PM";
		    else
		    	ap="AM";
		    time=time/100;
		    time=time%12;
		    
		    
		    System.out.println(time+ " >>> " +time +":"+min + ap);
	}

}
