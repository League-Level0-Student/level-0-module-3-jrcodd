package extras;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import org.jointheleague.graphical.robot.Robot;

public class ValentinesDay {
	public static void main(String[] args) {

		Robot rob = new Robot("batman");
		rob.changeRobot("https://d2gg9evh47fn9z.cloudfront.net/800px_COLOURBOX17743925.jpg");
		Robot jerry = new Robot("batman");
		jerry.changeRobot("https://d2gg9evh47fn9z.cloudfront.net/800px_COLOURBOX17743925.jpg");
		rob.setWindowImage("hearts.jpg");
		rob.setY(150);
		jerry.setY(150);
		rob.penDown();
		jerry.penDown();
		rob.setSpeed(100);
		jerry.setSpeed(100);
		rob.setPenWidth(5);
		jerry.setPenWidth(5);
		for (int i = 0; i < 220; i++) {
			rob.turn(1);
			jerry.turn(-1);
			rob.move(2);
			jerry.move(2);
		}
		for (int i = 0; i < 157; i++) {

			rob.move(2);
			jerry.move(2);
		}
		rob.penUp();
		jerry.penUp();
		rob.hide();
		jerry.hide();
		
	}
}
