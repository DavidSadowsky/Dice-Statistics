package main;
import java.util.Scanner;
import java.util.Random;

public class DieRoller {

	public static void main(String[] args) {
		
		// declare scanner
		Scanner myScanner = new Scanner(System.in);
		Random rand = new Random();
		
		
		boolean running = true;
		
		// declare user inputted variables
		int numberOfDies = 0;
		int dieFaces = 0;
		int numberOfRolls = 0;
		
		// random number variable
		int random = 0;
		
		
		
		
		while(running) {	
			// menu and user input
			System.out.println("==========Dice Simulator Statistics==========\n");
			System.out.println("This program answers dice frequency/probability questions given the number of faces on the die,\nhow many die, and how many times you roll the die(dice). \n\n"
					+ "\nPlease enter the number of die you want to roll (up to 2): ");
			numberOfDies = myScanner.nextInt();
			while(numberOfDies > 2 || numberOfDies < 1) {
				System.out.println("Invalid. Please select a value of 1 or 2.");
				numberOfDies = myScanner.nextInt();
			}
			System.out.println("Please enter the number of faces on each die (up to 6): ");
			dieFaces = myScanner.nextInt();
			while(dieFaces > 6 || dieFaces < 1) {
				System.out.println("Invalid. Please select a value of 1 through 6.");
				dieFaces = myScanner.nextInt();
			}
			System.out.println("Please enter the number of times you would like to roll the die(dice).");
			numberOfRolls = myScanner.nextInt();
			System.out.println("Thank you. Calculating...");
			
			int totalNums = numberOfDies * dieFaces;
			
			// variables to keep track of numbers rolled
			double oneRoll = 0;
			double twoRoll = 0;
			double threeRoll = 0;
			double fourRoll = 0;
			double fiveRoll = 0;
			double sixRoll = 0;
			double sevenRoll = 0;
			double eightRoll = 0;
			double nineRoll = 0;
			double tenRoll = 0;
			double elevenRoll = 0;
			double twelveRoll = 0;
			
			// for loop to store randomly generate dice rolls
			for(int i = 0; i < numberOfRolls; i++) {
				random = rand.nextInt((numberOfDies * dieFaces) + 1);
				if(random == 1) {
					oneRoll++;
				}
				else if(random == 2) {
					twoRoll++;
				}
				else if(random == 3) {
					threeRoll++;
				}
				else if(random == 4) {
					fourRoll++;
				}
				else if(random == 5) {
					fiveRoll++;
				}
				else if(random == 6) {
					sixRoll++;
				}
				else if(random == 7) {
					sevenRoll++;
				}
				else if(random == 8) {
					eightRoll++;
				}
				else if(random == 9) {
					nineRoll++;
				}
				else if(random == 10) {
					tenRoll++;
				}
				else if(random == 11) {
					elevenRoll++;
				}
				else if(random == 12) {
					twelveRoll++;
				}
			}
			
			double onePercent = 0;
			double twoPercent = 0;
			double threePercent = 0;
			double fourPercent = 0;
			double fivePercent = 0;
			double sixPercent = 0;
			double sevenPercent = 0;
			double eightPercent = 0;
			double ninePercent = 0;
			double tenPercent = 0;
			double elevenPercent = 0;
			double twelvePercent = 0;
			
			
			// percentage values
			if(totalNums > 0) {
			onePercent = oneRoll / numberOfRolls * 100;
			}
			if(totalNums > 1) {
			twoPercent = twoRoll / numberOfRolls * 100;
			}
			if(totalNums > 2) {
			threePercent = threeRoll / numberOfRolls * 100;
			}
			if(totalNums > 3) {
			fourPercent = fourRoll / numberOfRolls * 100;
			}
			if(totalNums > 4) {
			fivePercent = fiveRoll / numberOfRolls * 100;
			}
			if(totalNums > 5) {
			sixPercent = sixRoll / numberOfRolls * 100;
			}
			if(totalNums > 6) {
		    sevenPercent = sevenRoll / numberOfRolls * 100;
			}
			if(totalNums > 7) {
			eightPercent = eightRoll / numberOfRolls * 100;
			}
			if(totalNums > 8) {
			ninePercent = nineRoll / numberOfRolls * 100;
			}
			if(totalNums > 9) {
			tenPercent = tenRoll / numberOfRolls * 100;
			}
			if(totalNums > 10) {
			elevenPercent = elevenRoll / numberOfRolls * 100;
			}
			if(totalNums > 11) {
			twelvePercent = twelveRoll / numberOfRolls * 100;
			}
			
			// statistics output
			System.out.println("==========Report==========");
			if(totalNums > 0) {
			System.out.println("1| Frequency: " + oneRoll + " |Probability: " + onePercent + "%");
			}
			if(totalNums > 1) {
			System.out.println("2| Frequency: " + twoRoll + " |Probability: " + twoPercent + "%");
			}
			if(totalNums > 2) {
			System.out.println("3| Frequency: " + threeRoll + " |Probability: " + threePercent + "%");
			}
			if(totalNums > 3) {
			System.out.println("4| Frequency: " + fourRoll + " |Probability: " + fourPercent + "%");
			}
			if(totalNums > 4) {
			System.out.println("5| Frequency: " + fiveRoll + " |Probability: " + fivePercent + "%");
			}
			if(totalNums > 5) {
			System.out.println("6| Frequency: " + sixRoll + " |Probability: " + sixPercent + "%");
			}
			if(totalNums > 6) {
			System.out.println("7| Frequency: " + sevenRoll + " |Probability: " + sevenPercent + "%");
			}
			if(totalNums > 7) {
			System.out.println("8| Frequency: " + eightRoll + " |Probability: " + eightPercent + "%");
			}
			if(totalNums > 8) {
			System.out.println("9| Frequency: " + nineRoll + " |Probability: " + ninePercent + "%");
			}
			if(totalNums > 9) {
			System.out.println("10| Frequency: " + tenRoll + " |Probability: " + tenPercent + "%");
			}
			if(totalNums > 10) {
			System.out.println("11| Frequency: " + elevenRoll + " |Probability: " + elevenPercent + "%");
			}
			if(totalNums > 11) {
			System.out.println("12| Frequency: " + twelveRoll + " |Probability: " + twelvePercent + "%");
			}
			
			
			System.out.println("Would you like to roll again?\n1. Yes\n2. No");
			int choice = myScanner.nextInt();
			while(choice > 2 || choice < 1) {
				System.out.println("Invalid. Please select options 1 or 2.");
				choice = myScanner.nextInt();
			}
			if(choice == 1) {
				continue;
			}
			else if(choice == 2) {
				break;
			}
			
		}

	}

}
