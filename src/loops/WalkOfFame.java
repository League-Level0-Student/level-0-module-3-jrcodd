
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot[] robotList = { new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"),
				new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini"), new Robot("mini")};

		// 1. Set the X position of therobotList[i]ot so that it starts on the left.
		// You also need to show therobotList[i]ot to see the result of this line.

		// 2. Make the robot draw a star shape. Hint: 144.

		for (int j = 0; j < 20; j++) {

			for (int i = 0; i < robotList.length; i++) {
				if (j == 0) {
				
					robotList[i].setX(0);
				}
				robotList[i].setSpeed(100);
				robotList[i].setY(50 * (i));
				robotList[i].penDown();
				robotList[i].setAngle(45);
				robotList[i].setRandomPenColor();
				for (int k = 0; k < 5; k++) {

					robotList[i].move(30);
					robotList[i].turn(144);
				}
				robotList[i].setAngle(90);
				robotList[i].penUp();
				robotList[i].move(50);
			}

			// 3. Set the size of the star to 30.

			/** THE CHALLENGE: **/

			// Make the robot draw a line of stars like this: http://bit.ly/walk-of-fame

			// Hint: The distance between stars is 50.

		}
	}
}
