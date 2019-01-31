package laboratory14eisenstein;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//Counters for extended Challenge
		int wins = 0;
		int loses = 0;
		int ties = 0;
		
		
		
		//Prompt for the start
		System.out.println("Let's play a game of Rock, Paper, Scissors.");
		System.out.println("\nPlease enter your name:");
		
		String inputName = scnr.nextLine();
		
		Player human = new ConsolePlayer(scnr, inputName);
		Player rock = new RockPlayer("One Trick Teddy");
		Player superRock = new SuperRock("Rando Ron");
		
		//Now the fun begins. Opponent Selection
		System.out.println("\n"+inputName.toUpperCase()+ " has entered the dojo.\n");
		
		//To rerrun program y/n
	boolean run = true;
		while(run) {
		
		String prompt = ("Choose your opponent:\n1. One Trick Teddy \n   or \n2. Rando Ron\n");
		
		

		
		
		int number = Validator.getInt(scnr, prompt, 1, 2);
	
		System.out.println("\nIt's time to choose.\n");
		Roshambo humanChoice = human.generateRoshambo();
		Roshambo rockChoice = rock.generateRoshambo();
		Roshambo superRockChoice = superRock.generateRoshambo();
	

		if(number == 1) {
			System.out.println("\n"+rock.getName() + " played " + rockChoice);
			
		}else if(number == 2) { 
			System.out.println("\n"+superRock.getName() + " played " + superRockChoice);
			}
		
		System.out.println("\nYou played "+ humanChoice);
		System.out.println();
		
		//Result time
		while(number == 1) {
		if(humanChoice == rockChoice && number == 1) {
			System.out.println("TIE!!!!!");
			ties = ties+1;
			break;
		}else if(humanChoice == Roshambo.PAPER && rockChoice == Roshambo.ROCK && number == 1) {
			System.out.println(inputName+ " WINS!");
			wins = wins+1;
			break;
		}else if(humanChoice == Roshambo.SCISSORS && rockChoice == Roshambo.ROCK && number == 1) {
			System.out.println(inputName + " LOSES :(  !!!!!");
			loses = loses+1;
			break;
		}
		}
		
		while(number == 2) {
		if(humanChoice == superRockChoice && number == 2) {
				System.out.println("TIE!!!!!");
				ties = ties+1;
				break;
		}else if(humanChoice == Roshambo.PAPER && superRockChoice == Roshambo.ROCK && number == 2) {
				System.out.println(inputName+ " WINS!");
				wins = wins+1;
				break;
		}else if (humanChoice == Roshambo.PAPER && superRockChoice == Roshambo.SCISSORS && number ==2) {
				System.out.println(inputName+ " LOSES  :( !!!!!");
				loses = loses+1;
				break;
		}else if(humanChoice == Roshambo.SCISSORS && superRockChoice == Roshambo.ROCK && number == 2) {
				System.out.println(inputName + " LOSES :(  !!!!!");
				loses = loses+1;
				break;
		}else if(humanChoice == Roshambo.SCISSORS && superRockChoice == Roshambo.PAPER && number == 2) {
				System.out.println(inputName + " WINS!");
				wins = wins+1;
				break;
		}else if(humanChoice == Roshambo.ROCK && superRockChoice == Roshambo.SCISSORS && number == 2) {
				System.out.println(inputName + " WINS!");
				wins = wins+1;
				break;
		}else if(humanChoice == Roshambo.ROCK && superRockChoice == Roshambo.PAPER && number == 2) {
				System.out.println(inputName + " LOSES  :(  !!!!!");
				loses = loses+1;
				break;
					}
				}
		System.out.println();
		System.out.println("Wins= "+wins+"\nLoses= "+loses+ "\nTies= "+ties);
	
	System.out.println("\nWould you like to play again!?\n");
	String userChoice = Validator.getString(scnr, "\nWould you like to play again? (y/n)\n");
		if(userChoice.toLowerCase().startsWith("y")) {
			run = true;
		}else {
			run = false;
		}
		}
	}
}
