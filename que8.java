package com.gurukul.Homework;
 
import java.util.Scanner;

public class que8 {

    public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
    	  System.out.print("Enter name: ");
    	  String name = sc.nextLine();
          System.out.print("Enter units: ");
    	        int units = sc.nextInt();

          double amount = 0;

    	         if (units <= 100) {
    	            amount = units * 4;
    	        } else if (units <= 300) {
    	            amount = 100 * 4 + (units - 100) * 5;
    	        } else {
    	            amount = 100 * 4 + 200 * 5 + (units - 300) * 10;
    	        }

    	        double surcharge = 0;

    	        if (amount > 1000) {
    	            surcharge = amount * 0.05;
    	        }

    	        double total = amount + surcharge;
    	        double GST = total* 1.18;

    	        System.out.println("\nName: " + name);
    	        System.out.println("Units: " + units);
    	        System.out.printf("Amount to be paid:"+GST);
    	    }
    	}
   
     

