package com.gurukul.Homework;

import java.util.Scanner;

public class que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Enter a Number");
	      int num=sc.nextInt();
	      int first,second,output;
	      first=num/100;
	      //System.out.println(first);
	      second=num%100;
	     // System.out.println(second);
	      output=second*100+first;
	      System.out.println("Output:"+output);
	}

}
