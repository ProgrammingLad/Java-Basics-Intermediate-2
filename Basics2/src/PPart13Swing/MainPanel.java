package PPart13Swing;

import java.awt.Color;

import javax.swing.JPanel;

public class MainPanel extends JPanel implements ColorChangeListener {
	
	public MainPanel() {
		setBackground(Color.black);
	}
	
	public void changeColor(Color color) {
		setBackground(color);
	}

}
