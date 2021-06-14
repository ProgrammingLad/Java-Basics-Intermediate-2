package PPart13Swing;


import javax.swing.SwingUtilities;

public class JavaSpring {
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(() -> {
			new MainFrame("Eugene's Application");
		});
	}

}
