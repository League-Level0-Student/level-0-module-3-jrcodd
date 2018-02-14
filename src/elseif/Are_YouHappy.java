package elseif;

import javax.swing.JOptionPane;

public class Are_YouHappy {
	public static void main(String[] args) {
		int q1 = JOptionPane.showOptionDialog(null, "Are You Happy?", "Happiness", 0, JOptionPane.QUESTION_MESSAGE,
				null, new String[] { "yes", "no" }, null);
		if (q1 == 0) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		} else {
			int q2 = JOptionPane.showOptionDialog(null, "Do you want to be happy?", "Happiness", 0,
					JOptionPane.QUESTION_MESSAGE, null, new String[] { "yes", "no" }, null);
			if (q2 == 0) {
				JOptionPane.showMessageDialog(null, "Change Something");
			}
			else{
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
		}
System.exit(0);
	}
}
