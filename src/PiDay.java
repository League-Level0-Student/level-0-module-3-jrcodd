import java.net.URI;

import javax.swing.JOptionPane;

public class PiDay {
	public static void main(String[] args) {
		String pi = "3.14159265358";

		for (int j = 0; j < pi.length(); j++) {

			String guess = JOptionPane.showInputDialog("What is the next digit?");
			char piguess = pi.charAt(j);
			String piDigit = Character.toString(piguess);
			if (guess.equals(piDigit)) {
				System.out.print(piDigit);
			} else {
				JOptionPane.showMessageDialog(null, "Study Your pi for next year!!!");
				System.exit(0);
			}

		}

		playVideo("https://www.youtube.com/watch?v=6TPjRoWm8Ck");
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
