
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObediantRobot {
	static Random ran = new Random();
	
	public static void main(String[] args) {
		Robot rob = new Robot("mini");
		rob.penDown();
		rob.setSpeed(10000);
		for (int i = 0; i < 10; i++) {

			String shape = JOptionPane.showInputDialog("How may sides do you want?");
			int numSides = Integer.parseInt(shape);
			if (numSides < 10 && numSides > 2) {
				drawShape(rob, numSides);

			} else {
rob.setX(ran.nextInt(800));
rob.setY(ran.nextInt(800));
				drawCircle(rob);
			}
		}
	}

	private static void drawCircle(Robot rob) {
		for (int i = 0; i < 360; i++) {
			rob.move(1);
			rob.turn(360 / 360);
		}
	}

	private static void drawShape(Robot rob, int numSides) {
		for (int i = 0; i < numSides; i++) {
			rob.move(100);
			rob.turn(360 / numSides);
		}
	}

}
