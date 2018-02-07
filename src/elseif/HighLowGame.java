//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(100) + 1;
		// 2. Print out the random variable above

		// 11. do the following 10 times
		JOptionPane.showMessageDialog(null,
				"Welcome to the guessing game!! You have 10 tries to guess the random number between 1 and 100. Good luck!!");
		for (int i = 0; i < 10; i++) {

			// 1. ask the user for a guess using a pop-up window, and save their response

			String guess = JOptionPane.showInputDialog("What is your Guess?");
			// 4. convert the users’ answer to an int
			int guess2 = (Integer.parseInt(guess));
			// 5. if the guess is correct print win
			if (guess2 == random) {
				JOptionPane.showMessageDialog(null, "Yay! You win");
				System.exit(0);
			}

			// 7. if the guess is high tell them it's too high
			else if (guess2 > random) {

				JOptionPane.showMessageDialog(null, "too high try again");
			}
			// 9. if the guess is low tell them it's too low
			else if (guess2 < random) {

				JOptionPane.showMessageDialog(null, "Too low try again");
			}
		}
		// 12. tell them they lose
		JOptionPane.showMessageDialog(null, "You Loose :(");
	}

}
