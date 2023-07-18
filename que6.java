package com.gurukul.Homework;

import java.util.Scanner;

public class que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Enter a Number");
		    int num=sc.nextInt();
		     
		    int a,b,c;
		    
		    a=num/100;
		    //System.out.println(a);
		    int a1=num%100;
		    b=a1/10;
		    //System.out.println(b);
		    c=num%10;
		    //System.out.println(c);
		    
		    int Arm= a*a*a+b*b*b+c*c*c;
		    
		    if(Arm==num)
		    System.out.println(Arm+"It is an Armstrong Number");
		    else
		    System.out.println(num+" Its not an Armstrong Number");
			}

	}


