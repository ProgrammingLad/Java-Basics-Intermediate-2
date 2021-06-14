package PPart13Swing;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title);
		
		final MainPanel mainPanel = new MainPanel();
		final Toolbar toolbar = new Toolbar();
		
		toolbar.setColorChanger(mainPanel);
		
		setLayout(new BorderLayout());
		add(mainPanel, BorderLayout.CENTER);
		add(toolbar, BorderLayout.NORTH);
		
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
