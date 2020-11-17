package assignment.level_1;

import java.util.Scanner;

public class SevenUpDownGame {
	
	public void playGame() {
		System.out.println("!!!!!!Welcome to 7 Up Down!!!!!!");
		System.out.println("Choose an option from ==> (7Up / 7Down / 7Equal): ");
		Scanner scanner = new Scanner(System.in);
		String option = scanner.next();
		switch(option.toLowerCase()) {
		case "7down":
			System.out.println("Start 7 Down");
			int randomNumberTotalup = rollDice();
			if (randomNumberTotalup >= 2 && randomNumberTotalup <=6) {
				System.out.println("You won"+ "\n----------------------------------");
				playGame();
			}else {
				System.out.println("You lost"+ "\n----------------------------------");
				playGame();
			}
			break;
		case "7up":
			System.out.println("Start 7 Up");
			int randomNumberTotalDown = rollDice();
			if (randomNumberTotalDown >= 8 && randomNumberTotalDown <=12) {
				System.out.println("You won" + "\n----------------------------------" );
				playGame();
			}else {
				System.out.println("You lost"+ "\n----------------------------------" );
				playGame();
			}
			break;
		case "7equal":
			System.out.println("Start 7 Equal");
			int randomNumberTotalEqual = rollDice();
			if (randomNumberTotalEqual == 7) {
				System.out.println("You won"+ "\n----------------------------------");
				playGame();
			}else {
				System.out.println("You lost"+ "\n----------------------------------");
				playGame();
			};
			break;	
		default:
			System.out.println("Please choose valid option");
			playGame();
			break;
		}
			
	}
	
	public int rollDice() {
		int randomNumber1 = (int)((Math.random())*6);
		int randomNumber2 = (int)((Math.random())*6);
		while( randomNumber1 == 0 || randomNumber2 == 0) {
			randomNumber1 = (int)((Math.random())*6);
			randomNumber2 = (int)((Math.random())*6);
		}
		System.out.println("The first dise is " + randomNumber1 + "\n" + "The second dise is " + randomNumber2);
		int randomNumberTotal = randomNumber1+randomNumber2;
		return randomNumberTotal;
	}

	public static void main(String[] args) {
		SevenUpDownGame game = new SevenUpDownGame();
		game.playGame();
	}

}
