package com.gurukul.Homework;
import java.util.*;
public class Day1Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a miliseconds:");
     int num=sc.nextInt();
     int sec,min,hour;
     
     sec=num/1000;
     int seconds=sec%60;
     //System.out.println( seconds);
     
     min=seconds+sec/60;
     int minutes=min%100;
     //System.out.println(minutes);
      hour= sec/3600;
    // System.out.println(hour);
      
      System.out.println(hour+":"+minutes+":"+seconds);
     
	}

}
