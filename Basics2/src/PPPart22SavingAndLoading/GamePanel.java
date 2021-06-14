package PPPart22SavingAndLoading;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import PPPart20SwingExercise.GUI.World;

public class GamePanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private final static int CELLSIZE = 100;
	
	private final static Color backgroundColor = Color.BLACK;
	private final static Color foregroundColor = Color.GREEN;
	private final static Color gridColor = Color.GRAY;
	
	private int topBottomMargin;
	private int leftRightMargin;
	
	private World1 world;
	
	public GamePanel() {
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				//To view what coordinates is being clicked
				//System.out.println(e.getX() + ", " + e.getY());
				
				int row = (e.getY() - topBottomMargin)/CELLSIZE;
				int col = (e.getX() - leftRightMargin)/CELLSIZE;
				
				if(row >= world.getRows() || col >= world.getColumns()) {
					return;
				}
				
				boolean status = world.getCell(row, col);
				world.setCell(row, col, !status);
				
				repaint();
			}
		});
	
	}
	
	//For us to draw on the panel
	protected void paintComponent(Graphics g) {
		
		Graphics2D g2d = (Graphics2D)g;
		
		int width = getWidth();
		int height = getHeight();
		
		leftRightMargin = ((width % CELLSIZE) + CELLSIZE)/2;
		topBottomMargin = ((height % CELLSIZE) + CELLSIZE)/2;
		
		int rows = (height - 2 * topBottomMargin) / CELLSIZE;
		int columns = (width - 2 * leftRightMargin) / CELLSIZE;
		
		if(world == null) {
			world = new World1(rows,columns);
		}
		
		g2d.setColor(backgroundColor);
		g2d.fillRect(0, 0, width, height);
		
		g2d.setColor(foregroundColor);
		
		drawGrid(g2d, width, height);

		for(int col = 0; col < columns; col++) {
			for (int row = 0; row < rows; row++) {
				
				boolean status = world.getCell(row, col);	
				fillCell(g2d, row, col, status);
			}
		}
	}
	
	private void fillCell(Graphics2D g2d, int row, int col, boolean status) {
		
		Color color = status ? foregroundColor: backgroundColor;
		g2d.setColor(color);
		
		int x = leftRightMargin + (col * CELLSIZE);
		int y = topBottomMargin + (row * CELLSIZE);
		
		g2d.fillRect(x + 1, y + 1, CELLSIZE - 2, CELLSIZE - 2);
	}
	
	private void drawGrid (Graphics2D g2d, int width, int height) {
		g2d.setColor(gridColor);
	
		for(int x = leftRightMargin; x <= width - leftRightMargin; x += CELLSIZE) {
			g2d.drawLine(x, topBottomMargin, x, height - topBottomMargin);
		}
		
		for(int y = topBottomMargin; y <= height - topBottomMargin; y += CELLSIZE) {
			g2d.drawLine(leftRightMargin, y, width - leftRightMargin, y);
		}
	
	}

	public void randomize() {
		
		world.randomize();
		repaint();
		
	}

	public void clear() {
		
		world.clear();
		repaint();
	}
	
	public void next() {
		
		world.next();
		repaint();
	}

	public void save(File selectedFile) {
		try {
		world.save(selectedFile);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "Cannot open selected File");
		}
	}

	public void open(File selectedFile) {
		try {
			world.load(selectedFile);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, "Cannot load selected File");
			}
		repaint();
		
	}
}

