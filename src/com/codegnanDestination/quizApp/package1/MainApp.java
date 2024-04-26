package com.codegnanDestination.quizApp.package1;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("Welcome to Quiz App\n");
		
		System.out.println("Please enter your details:");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter the email: ");
		String email = sc.next();
		
		System.out.println("Enter the phone: ");
		long phone = sc.nextLong();
		
		System.out.println("Enter the city: ");
		String city = sc.next();
		
		System.out.println("Enter the state: ");
		String state = sc.next();
		
		System.out.println("Enter the country: ");
		String country = sc.next();
		System.out.println();
		
		Participants p = new Participants(name,email,phone,city,state,country);
		
		System.out.println("Welcome to the Quiz game, "+p.getName());
		System.out.println();
		
		System.out.println("The guidelines for the game are as follows: ");
		System.out.println(Guidelines.guideline1+ "\n" + Guidelines.guideline2+ "\n" + Guidelines.guideline3+ "\n" + Guidelines.guideline4+ "\n");
		
		System.out.println("Do you wish to start the game(Yes or No)");
		boolean acceptance = sc.nextBoolean();
		System.out.println();
		
		if(acceptance == true)
		{
			Options op = new Options();
			System.out.println("\nHere is your first question.");
			System.out.println(Questions.question1);
			boolean res1 = op.optionsForQuestion1(p);
			if(res1 == true)
			{
				p.setAmount(1000);
				System.out.println("Correct Answer. You have won Rs. "+p.getAmount());
				System.out.println("\nHere is your second question");
				System.out.println(Questions.question2);
				boolean res2 = op.optionsForQuestion2(p);
				if(res2 == true)
				{
					p.setAmount(2000);
					System.out.println("\nCorrect Answer. You have won Rs. "+p.getAmount());
					System.out.println("\nHere is your third question");
					System.out.println(Questions.question3);
					boolean res3 = op.optionsForQuestion3(p);
					if(res3 == true)
					{
						p.setAmount(3000);
						System.out.println("\nCorrect Answer. You have won Rs. "+p.getAmount());
						System.out.println("\nHere is your fourth question");
						System.out.println(Questions.question4);
						boolean res4 = op.optionsForQuestion4(p);
						if(res4 == true)
						{
							p.setAmount(4000);
							System.out.println("\nCorrect Answer. You have won Rs. "+p.getAmount());
							System.out.println("\nHere is your fifth question");
							System.out.println(Questions.question5);
							boolean res5 = op.optionsForQuestion5(p);
							if(res5 == true)
							{
								p.setAmount(5000);
								System.out.println("\nCorrect Answer. You have won Rs. "+p.getAmount());
								System.out.println("\nHere is your sixth question");
								System.out.println(Questions.question6);
								boolean res6 = op.optionsForQuestion6(p);
								if(res6 == true)
								{
									p.setAmount(6000);
									System.out.println("\nCorrect Answer. You have won Rs. "+p.getAmount());
									System.out.println("\nHere is your seventh question");
									System.out.println(Questions.question7);
									boolean res7 = op.optionsForQuestion7(p);
									if(res7 == true)
									{
										p.setAmount(7000);
										System.out.println("\nCorrect Answer. You have won Rs. "+p.getAmount());
										System.out.println("\nHere is your eigth question");
										System.out.println(Questions.question8);
										boolean res8 = op.optionsForQuestion8(p);
										if(res8 == true)
										{
											p.setAmount(8000);
											System.out.println("\nCorrect Answer. You have won Rs. "+p.getAmount());
											System.out.println("\nHere is your ninth question");
											System.out.println(Questions.question9);
											boolean res9 = op.optionsForQuestion9(p);
											if(res9 == true)
											{
												p.setAmount(9000);
												System.out.println("\nCorrect Answer. You have won Rs. "+p.getAmount());
												System.out.println("\nHere is your tenth question");
												System.out.println(Questions.question10);
												boolean res10 = op.optionsForQuestion10(p);
												if(res10 == true)
												{
													p.setAmount(10000);
													System.out.println("\nCorrect Answer. You have won Rs. "+p.getAmount());
												}
												else
												{
													System.out.println("\nAm Sorry, Your option is incorrect. You have won Rs. "+p.getAmount());
												}
											}
											else
											{
												System.out.println("\nAm Sorry, Your option is incorrect. You have won Rs. "+p.getAmount());
											}
										}
										else
										{
											System.out.println("\nAm Sorry, Your option is incorrect. You have won Rs. "+p.getAmount());
										}
									}
									else
									{
										System.out.println("\nAm Sorry, Your option is incorrect. You have won Rs. "+p.getAmount());
									}
								}
								else
								{
									System.out.println("\nAm Sorry, Your option is incorrect. You have won Rs. "+p.getAmount());
								}
							}
							else
							{
								System.out.println("\nAm Sorry, Your option is incorrect. You have won Rs. "+p.getAmount());
							}
						}
						else
						{
							System.out.println("\nAm Sorry, Your option is incorrect. You have won Rs. "+p.getAmount());
						}
					}
					else
					{
						System.out.println("\nAm Sorry, Your option is incorrect. You have won Rs. "+p.getAmount());
					}
				}
				else
				{
					System.out.println("\nAm Sorry, Your option is incorrect. You have won Rs. "+p.getAmount());
				}
			}
			else
			{
				System.out.println("\nAm Sorry, Your option is incorrect. You have won Rs. "+p.getAmount());
			}
		}
		else
		{
			System.out.println("Thank you for your interest.");
			System.exit(0);
		}
		
		sc.close();
	}
}
