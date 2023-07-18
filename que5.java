package com.gurukul.Homework;

import java.util.Scanner;

public class que5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Enter a Number");
		    
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d;
		   
//		    if(a>b)//(7>3)
//		    	d=a;
//		    else
//		    	 d=b;
//		        if(d<c)
//		        	d=c;
		    
		    int max=Math.max(a, b);
		    int max1=Math.max(max, c);
		        System.out.println("Largest Number is :"+max1);
	}

}
