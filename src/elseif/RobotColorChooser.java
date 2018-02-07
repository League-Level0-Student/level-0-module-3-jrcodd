
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot rob = new Robot("mini");
		rob.setSpeed(100);
		// 3. ask the user what color they would like the robot to draw
		for (int i = 0;; i++) {

			String robotColor = JOptionPane.showInputDialog("What color do you like(red, green, or blue?");
			// 4. use an if/else statement to set the pen color that the user requested
			if (robotColor.equals("red")) {

				rob.setPenColor(255, 0, 0);
			} else if (robotColor.equals("blue")) {

				rob.setPenColor(0, 0, 255);
			} else if (robotColor.equals("green")) {

				rob.setPenColor(Color.GREEN);
			}

			// 5. if the user doesn’t enter anything, choose a random color
			else {

				rob.setRandomPenColor();
			}
			// 6. put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 2. set the pen width to 10
			rob.setPenWidth(10);
			// 1. make the robot draw a shape (this will take more than one line of code)
			rob.penDown();
			for (int j = 0; j < 3; j++) {
				rob.turn(360 / 3);
				rob.move(100);
			}
		}
	}
}
