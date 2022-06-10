package com.JANA60.javaFestaFerragnez.controller.main;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		
		String[] guests= {
				"Dua Lipa", 
				"Paris Hilton", 
				"Manuel Agnelli", 
				"J-Ax", 
				"Francesco Totti", 
				"Ilary Blasi", 
				"Bebe Vio", 
				"Luis", 
				"Pardis Zarei", 
				"Martina Maccherone", 
				"Rachel Zeilic"};
		
		String name, repeat;
		boolean invited=false;
		
		
		Scanner keyboard= new Scanner (System.in);
		
		do
		{
		
			System.out.println("Welcome to Ferragnez' Mansion. \nPlease write your name so I can check if you have the permission to get in.");
			
			name=keyboard.nextLine();
			
			for(int i=0; i<guests.length;i++)
			{
				if(guests[i].equalsIgnoreCase(name))
					invited=true;
			}
			
			/*
			 * parte bonus che lascio come commento
			 * 
			 * int counter=0;
			 * 
			 * while(invited=false && counter<guests.length)
			 * {
			 * 		if(guests[counter]==name
			 * 			invited=true
			 * 		else
			 * 			counter++
			 * 		
			 * }
			 */
			
			if(invited)
				System.out.println("Welcome to the party, make yourself at home.");
			else
				System.out.println("Sorry, you are not in the guest's list. \nPlease go away or I'll have to call the security.");
			
			do
			{
				System.out.println("Is there a new guest?");
				
				repeat=keyboard.nextLine();
				
				if(!repeat.equalsIgnoreCase("yes") && !repeat.equalsIgnoreCase("no"))
					System.out.println("Wrong input. Please insert yes or no.");
				
			}while(!repeat.equalsIgnoreCase("yes") && !repeat.equalsIgnoreCase("no"));
			
		
		}while(repeat.equalsIgnoreCase("yes"));
		
		
		keyboard.close();
	}
		
}


