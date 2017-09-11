package alone.controller;

import java.util.Scanner;

import sample.model.PlayDohCircle;

import sample.model.PlayDohSquare; 

public class AloneController 
{
	public AloneController()
	{
		
	}
	public void start()
	{
	
		System.out.println("This is the first line of text");
		System.out.println("This is the second line of text");
		System.out.println("");
		System.out.println("This is the third line of text on the fourth line");
		
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		PlayDohCircle thirdCircle;
		thirdCircle = new PlayDohCircle(10);
		
		
		PlayDohSquare firstSquare = new PlayDohSquare();
		PlayDohSquare secondSquare;
		secondSquare = new PlayDohSquare();
		PlayDohSquare thirdSquare;
		thirdSquare = new PlayDohSquare(10);
		
		System.out.println("Here is my play doh circle");
		System.out.println(firstCircle);
		System.out.println("Here is my second circle " + secondCirce);
		
		System.out.println("Here is my Play doh square");
		System.out.println(firstsquare);
		System.out.println("Here is my second square" + secondSquare);
		
		testScanner();
	}
	
	private void testScanner()
	{
		Scanner firstScanner; //Declares a Scanner object
		firstScanner = new Scanner(System.in); //Indicates a Scanner object.
		System.out.println("Please type your favorite food");
		String answer = firstScanner.nextLine(); //Whatever gets typed ii am going to grab that and store it in a thing called an answer
		System.out.println("Oh, you like to eat " + answer);
	}
}
