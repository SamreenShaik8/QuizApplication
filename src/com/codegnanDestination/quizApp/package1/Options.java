package com.codegnanDestination.quizApp.package1;

import java.util.Scanner;

public class Options {
	int life_line_count=1;
	Scanner sc=new Scanner(System.in);
	
	boolean optionsForQuestion1(Participants p)
	{
		System.out.println("1. James Gosling\n" + 
						   "2. E F Codd\n"+
						   "3. Dennis Ritchie\n"+
						   "4. Steve jobs\n"+
						   "5. Life Line\n"+
						   "6. Quit");
		System.out.println("Select the correct option: ");
		int num = sc.nextInt();
		
		if(num==1)
		{
			return true;
		}
		else if(num==5) {
			if(life_line_count!=0) 
			{
				System.out.println("Please select the LifeLine: ");
				System.out.println("1. Audience Phone");
				int choice = sc.nextInt();
				
				if(choice == 1) {
					life_line_count--;
					System.out.println("1. James Gosling ---> 75%\n" + 
						   "2. E F Codd ---> 12%\n"+
						   "3. Dennis Ritchie ---> 0%\n"+
						   "4. Steve jobs ---> 13%\n");
					System.out.println("Please select an option: ");
					num = sc.nextInt();
					if(num==1) 
					{
						return true;
					}
					else
					{
						return false;
					}
				}
				
			}
			else
			{
				System.out.println("You have no LifeLines left\n"+
									"Please select an option");
				System.out.println("1. James Gosling\n" + 
						   "2. E F Codd\n"+
						   "3. Dennis Ritchie\n"+
						   "4. Steve jobs\n"+
						   "6. Quit");
				num = sc.nextInt();
				if(num==1)
				{
					return true;
				}
				else if(num==6)
				{
					System.out.println("Thank you for participating.");
					System.out.println("You have won Rs. "+p.getAmount());
					System.exit(0);
				}
				else
				{
					return false;
				}
			}
		}
		else if(num==6)
		{
			System.out.println("Thank you for participating.");
			System.out.println("You have won Rs. "+p.getAmount());
			System.exit(0);
		}
		return false;
	}
	
	boolean optionsForQuestion2(Participants p)
	{
		System.out.println("1. Virat Kohli\n" + 
						   "2. Sanju Samson\n"+
						   "3. Rohit Sharma\n"+
						   "4. Shubman Gill\n"+
						   "5. Life Line\n"+
						   "6. Quit");
		System.out.println("Select the correct option: ");
		int num = sc.nextInt();
		
		if(num==3)
		{
			return true;
		}
		else if(num==5) {
			if(life_line_count!=0) 
			{
				System.out.println("Please select the LifeLine: ");
				System.out.println("1. Audience Phone");
				int choice = sc.nextInt();
				
				if(choice == 1) {
					life_line_count--;
					System.out.println("1. Virat Kohli ---> 40%\n" + 
							   "2. Sanju Samson ---> 2%\n"+
							   "3. Rohit Sharma ---> 53%\n"+
							   "4. Shubman Gill --->3%\n");
					System.out.println("Please select an option: ");
					num = sc.nextInt();
					if(num==3) 
					{
						return true;
					}
					else
					{
						return false;
					}
				}
				
			}
			else
			{
				System.out.println("You have no LifeLines left\n"+
									"Please select an option");
				System.out.println("1. Virat Kohli\n" + 
						   "2. Sanju Samson\n"+
						   "3. Rohit Sharma\n"+
						   "4. Shubman Gill\n"+
						   "6. Quit");
				num = sc.nextInt();
				if(num==3)
				{
					return true;
				}
				else if(num==6)
				{
					System.out.println("Thank you for participating.");
					System.out.println("You have won Rs. "+p.getAmount());
					System.exit(0);
				}
				else
				{
					return false;
				}
			}
		}
		else if(num==6)
		{
			System.out.println("Thank you for participating.");
			System.out.println("You have won Rs. "+p.getAmount());
			System.exit(0);
		}
		return false;
	}
	
	boolean optionsForQuestion3(Participants p)
	{
		System.out.println("1. 6\n" + 
						   "2. 7\n"+
						   "3. 8\n"+
						   "4. 9\n"+
						   "5. Life Line\n"+
						   "6. Quit");
		System.out.println("Select the correct option: ");
		int num = sc.nextInt();
		
		if(num==3)
		{
			return true;
		}
		else if(num==5) {
			if(life_line_count!=0) 
			{
				System.out.println("Please select the LifeLine: ");
				System.out.println("1. Audience Phone");
				int choice = sc.nextInt();
				
				if(choice == 1) {
					life_line_count--;
					System.out.println("1. 6 ---> 12%\n" + 
						   "2. 7 ---> 0%\n"+
						   "3. 8 ---> 75%%\n"+
						   "4. 9 ---> 13%\n");
					System.out.println("Please select an option: ");
					num = sc.nextInt();
					if(num==3) 
					{
						return true;
					}
					else
					{
						return false;
					}
				}
				
			}
			else
			{
				System.out.println("You have no LifeLines left\n"+
									"Please select an option");
				System.out.println("1. 6\n" + 
						   "2. 7\n"+
						   "3. 8\n"+
						   "4. 9\n"+
						   "6. Quit");
				num = sc.nextInt();
				if(num==3)
				{
					return true;
				}
				else if(num==6)
				{
					System.out.println("Thank you for participating.");
					System.out.println("You have won Rs. "+p.getAmount());
					System.exit(0);
				}
				else
				{
					return false;
				}
			}
		}
		else if(num==6)
		{
			System.out.println("Thank you for participating.");
			System.out.println("You have won Rs. "+p.getAmount());
			System.exit(0);
		}
		return false;
	}
	
	boolean optionsForQuestion4(Participants p)
	{
		System.out.println("1. At run time\n" + 
						   "2. At compile time\n"+
						   "3. depends on the code\n"+
						   "4. None\n"+
						   "5. Life Line\n"+
						   "6. Quit");
		System.out.println("Select the correct option: ");
		int num = sc.nextInt();
		
		if(num==1)
		{
			return true;
		}
		else if(num==5) {
			if(life_line_count!=0) 
			{
				System.out.println("Please select the LifeLine: ");
				System.out.println("1. Audience Phone");
				int choice = sc.nextInt();
				
				if(choice == 1) {
					life_line_count--;
					System.out.println("1. At run time --->60%\n" + 
							   "2. At compile time --->23%\n"+
							   "3. depends on the code --->7%\n"+
							   "4. None --->10%\n");
					System.out.println("Please select an option: ");
					num = sc.nextInt();
					if(num==1) 
					{
						return true;
					}
					else
					{
						return false;
					}
				}
				
			}
			else
			{
				System.out.println("You have no LifeLines left\n"+
									"Please select an option");
				System.out.println("1. At run time\n" + 
						   "2. At compile time\n"+
						   "3. depends on the code\n"+
						   "4. None\n"+
						   "6. Quit");
				num = sc.nextInt();
				if(num==1)
				{
					return true;
				}
				else if(num==6)
				{
					System.out.println("Thank you for participating.");
					System.out.println("You have won Rs. "+p.getAmount());
					System.exit(0);
				}
				else
				{
					return false;
				}
			}
		}
		else if(num==6)
		{
			System.out.println("Thank you for participating.");
			System.out.println("You have won Rs. "+p.getAmount());
			System.exit(0);
		}
		return false;
	}
	
	boolean optionsForQuestion5(Participants p)
	{
		System.out.println("1. java.lang.String\n" + 
						   "2. java.lang.util\n"+
						   "3. java.lang.Object\n"+
						   "4. None\n"+
						   "5. Life Line\n"+
						   "6. Quit");
		System.out.println("Select the correct option: ");
		int num = sc.nextInt();
		
		if(num==3)
		{
			return true;
		}
		else if(num==5) {
			if(life_line_count!=0) 
			{
				System.out.println("Please select the LifeLine: ");
				System.out.println("1. Audience Phone");
				int choice = sc.nextInt();
				
				if(choice == 1) {
					life_line_count--;
					System.out.println("1. java.lang.String --->17%\n" + 
							   "2. java.lang.util --->23%\n"+
							   "3. java.lang.Object --->60%\n"+
							   "4. None --->0%\n");
					System.out.println("Please select an option: ");
					num = sc.nextInt();
					if(num==3) 
					{
						return true;
					}
					else
					{
						return false;
					}
				}
				
			}
			else
			{
				System.out.println("You have no LifeLines left\n"+
									"Please select an option");
				System.out.println("1. java.lang.String\n" + 
						   "2. java.lang.util\n"+
						   "3. java.lang.Object\n"+
						   "4. None\n"+
						   "6. Quit");
				num = sc.nextInt();
				if(num==3)
				{
					return true;
				}
				else if(num==6)
				{
					System.out.println("Thank you for participating.");
					System.out.println("You have won Rs. "+p.getAmount());
					System.exit(0);
				}
				else
				{
					return false;
				}
			}
		}
		else if(num==6)
		{
			System.out.println("Thank you for participating.");
			System.out.println("You have won Rs. "+p.getAmount());
			System.exit(0);
		}
		return false;
	}
	
	boolean optionsForQuestion6(Participants p)
	{
		System.out.println("1. Heap\n" + 
						   "2. Array\n"+
						   "3. tree\n"+
						   "4. Stack\n"+
						   "5. Life Line\n"+
						   "6. Quit");
		System.out.println("Select the correct option: ");
		int num = sc.nextInt();
		
		if(num==4)
		{
			return true;
		}
		else if(num==5) {
			if(life_line_count!=0) 
			{
				System.out.println("Please select the LifeLine: ");
				System.out.println("1. Audience Phone");
				int choice = sc.nextInt();
				
				if(choice == 1) {
					life_line_count--;
					System.out.println("1. Heap ---> 40%\n" + 
							   "2. Array --->3%\n"+
							   "3. tree --->2%\n"+
							   "4. Stack --->53%\n");
					System.out.println("Please select an option: ");
					num = sc.nextInt();
					if(num==4) 
					{
						return true;
					}
					else
					{
						return false;
					}
				}
				
			}
			else
			{
				System.out.println("You have no LifeLines left\n"+
									"Please select an option");
				System.out.println("1. Heap\n" + 
						   "2. Array\n"+
						   "3. tree\n"+
						   "4. Stack\n"+
						   "6. Quit");
				num = sc.nextInt();
				if(num==4)
				{
					return true;
				}
				else if(num==6)
				{
					System.out.println("Thank you for participating.");
					System.out.println("You have won Rs. "+p.getAmount());
					System.exit(0);
				}
				else
				{
					return false;
				}
			}
		}
		else if(num==6)
		{
			System.out.println("Thank you for participating.");
			System.out.println("You have won Rs. "+p.getAmount());
			System.exit(0);
		}
		return false;
	}
	
	boolean optionsForQuestion7(Participants p)
	{
		System.out.println("1. public\n" + 
						   "2. protected\n"+
						   "3. private\n"+
						   "4. static\n"+
						   "5. Life Line\n"+
						   "6. Quit");
		System.out.println("Select the correct option: ");
		int num = sc.nextInt();
		
		if(num==4)
		{
			return true;
		}
		else if(num==5) {
			if(life_line_count!=0) 
			{
				System.out.println("Please select the LifeLine: ");
				System.out.println("1. Audience Phone");
				int choice = sc.nextInt();
				
				if(choice == 1) {
					life_line_count--;
					System.out.println("1. public --->7%\n" + 
							   "2. protected --->10%\n"+
							   "3. private --->23%\n"+
							   "4. static --->60%\n");
					System.out.println("Please select an option: ");
					num = sc.nextInt();
					if(num==4) 
					{
						return true;
					}
					else
					{
						return false;
					}
				}
				
			}
			else
			{
				System.out.println("You have no LifeLines left\n"+
									"Please select an option");
				System.out.println("1. public\n" + 
						   "2. protected\n"+
						   "3. private\n"+
						   "4. static\n"+
						   "6. Quit");
				num = sc.nextInt();
				if(num==4)
				{
					return true;
				}
				else if(num==6)
				{
					System.out.println("Thank you for participating.");
					System.out.println("You have won Rs. "+p.getAmount());
					System.exit(0);
				}
				else
				{
					return false;
				}
			}
		}
		else if(num==6)
		{
			System.out.println("Thank you for participating.");
			System.out.println("You have won Rs. "+p.getAmount());
			System.exit(0);
		}
		return false;
	}
	
	boolean optionsForQuestion8(Participants p)
	{
		System.out.println("1. JDK\n" + 
						   "2. JRE\n"+
						   "3. JDB\n"+
						   "4. JVM\n"+
						   "5. Life Line\n"+
						   "6. Quit");
		System.out.println("Select the correct option: ");
		int num = sc.nextInt();
		
		if(num==3)
		{
			return true;
		}
		else if(num==5) {
			if(life_line_count!=0) 
			{
				System.out.println("Please select the LifeLine: ");
				System.out.println("1. Audience Phone");
				int choice = sc.nextInt();
				
				if(choice == 1) {
					life_line_count--;
					System.out.println("1. JDK --->2%\n" + 
							   "2. JRE --->3%\n"+
							   "3. JDB --->53%\n"+
							   "4. JVM --->40%\n");
					System.out.println("Please select an option: ");
					num = sc.nextInt();
					if(num==3) 
					{
						return true;
					}
					else
					{
						return false;
					}
				}
				
			}
			else
			{
				System.out.println("You have no LifeLines left\n"+
									"Please select an option");
				System.out.println("1. JDK\n" + 
						   "2. JRE\n"+
						   "3. JDB\n"+
						   "4. JVM\n"+
						   "6. Quit");
				num = sc.nextInt();
				if(num==3)
				{
					return true;
				}
				else if(num==6)
				{
					System.out.println("Thank you for participating.");
					System.out.println("You have won Rs. "+p.getAmount());
					System.exit(0);
				}
				else
				{
					return false;
				}
			}
		}
		else if(num==6)
		{
			System.out.println("Thank you for participating.");
			System.out.println("You have won Rs. "+p.getAmount());
			System.exit(0);
		}
		return false;
	}
	
	boolean optionsForQuestion9(Participants p)
	{
		System.out.println("1. java.lang\n" + 
						   "2. java.awt\n"+
						   "3. java.applet\n"+
						   "4. java.string\n"+
						   "5. Life Line\n"+
						   "6. Quit");
		System.out.println("Select the correct option: ");
		int num = sc.nextInt();
		
		if(num==1)
		{
			return true;
		}
		else if(num==5) {
			if(life_line_count!=0) 
			{
				System.out.println("Please select the LifeLine: ");
				System.out.println("1. Audience Phone");
				int choice = sc.nextInt();
				
				if(choice == 1) {
					life_line_count--;
					System.out.println("1. java.lang --->60%\n" + 
							   "2. java.awt --->0%\n"+
							   "3. java.applet ---> 17%\n"+
							   "4. java.string --->23%\n");
					System.out.println("Please select an option: ");
					num = sc.nextInt();
					if(num==1) 
					{
						return true;
					}
					else
					{
						return false;
					}
				}
				
			}
			else
			{
				System.out.println("You have no LifeLines left\n"+
									"Please select an option");
				System.out.println("1. java.lang\n" + 
						   "2. java.awt\n"+
						   "3. java.applet\n"+
						   "4. java.string\n"+
						   "6. Quit");
				num = sc.nextInt();
				if(num==1)
				{
					return true;
				}
				else if(num==6)
				{
					System.out.println("Thank you for participating.");
					System.out.println("You have won Rs. "+p.getAmount());
					System.exit(0);
				}
				else
				{
					return false;
				}
			}
		}
		else if(num==6)
		{
			System.out.println("Thank you for participating.");
			System.out.println("You have won Rs. "+p.getAmount());
			System.exit(0);
		}
		return false;
	}
	
	boolean optionsForQuestion10(Participants p)
	{
		System.out.println("1. 24\n" + 
						   "2. 23\n"+
						   "3. 20\n"+
						   "4. 25\n"+
						   "5. Life Line\n"+
						   "6. Quit");
		System.out.println("Select the correct option: ");
		int num = sc.nextInt();
		
		if(num==4)
		{
			return true;
		}
		else if(num==5) {
			if(life_line_count!=0) 
			{
				System.out.println("Please select the LifeLine: ");
				System.out.println("1. Audience Phone");
				int choice = sc.nextInt();
				
				if(choice == 1) {
					life_line_count--;
					System.out.println("1. 24 ---> 40%\n" + 
							   "2. 23 ---> 3%\n"+
							   "3. 20 ---> 2%\n"+
							   "4. 25 ---> 53%\n");
					System.out.println("Please select an option: ");
					num = sc.nextInt();
					if(num==4) 
					{
						return true;
					}
					else
					{
						return false;
					}
				}
				
			}
			else
			{
				System.out.println("You have no LifeLines left\n"+
									"Please select an option");
				System.out.println("1. 24\n" + 
						   "2. 23\n"+
						   "3. 20\n"+
						   "4. 25\n"+
						   "6. Quit");
				num = sc.nextInt();
				if(num==4)
				{
					return true;
				}
				else if(num==6)
				{
					System.out.println("Thank you for participating.");
					System.out.println("You have won Rs. "+p.getAmount());
					System.exit(0);
				}
				else
				{
					return false;
				}
			}
		}
		else if(num==6)
		{
			System.out.println("Thank you for participating.");
			System.out.println("You have won Rs. "+p.getAmount());
			System.exit(0);
		}
		return false;
	}
}
