package PPPart20SwingExercise;

import javax.swing.SwingUtilities;

import PPPart20SwingExercise.GUI.MainFrame;

public class Main {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(() -> {
			new MainFrame();
		});
	}
}
