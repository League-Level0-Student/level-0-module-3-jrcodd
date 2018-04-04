package extras;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class houses {

	public static void main(String[] args) {
		Random t = new Random();
		int height = t.nextInt(300) + 50;
		Robot fredrik = new Robot("mini");
		fredrik.setSpeed(100);
		fredrik.penDown();
		fredrik.moveTo(50, 450);
		fredrik.setWindowColor(0, 0, 0);
	
		for (int i = 0; i < 17; i++) {
			
			
			height = (t.nextInt(300) + 50);
			if(height<150) {
				
				drawPointy(height, fredrik);
			}
			else {
				drawFlat( height, fredrik);
			}
		}
	}

	private static void drawFlat(int height, Robot fredrik) {
		fredrik.setRandomPenColor();
		fredrik.setPenWidth(25);
		fredrik.setAngle(0);
		 fredrik.move(height);
		fredrik.turn(90);
		fredrik.move(30);
		fredrik.turn(90);
		fredrik.move(height);
		fredrik.setPenColor(0, 255, 0);
		fredrik.turn(-90);
		fredrik.setPenWidth(1);
		fredrik.move(25);
	}
	private static void drawPointy(int height, Robot fredrik) {
		fredrik.setRandomPenColor();
		fredrik.setPenWidth(25);
		fredrik.setAngle(0);
		 fredrik.move(height);
		fredrik.turn(45);
		fredrik.move(15);
		fredrik.turn(90);
		fredrik.move(15);
		fredrik.setAngle(180);
		fredrik.move(height);
		fredrik.setPenColor(0, 255, 0);
		fredrik.turn(-90);
		fredrik.setPenWidth(1);
		fredrik.move(25);
	}
	
	
}
