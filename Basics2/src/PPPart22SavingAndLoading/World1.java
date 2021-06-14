package PPPart22SavingAndLoading;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class World1 {
	private int rows;
	private int columns;
	
	private boolean[][] grid;
	
	public World1(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		
		grid = new boolean[rows][columns];
	}
	
	public void setCell(int row, int col, boolean status) {
		grid[row][col] = status;
	}
	
	public boolean getCell(int row, int col) {
		return grid[row][col];
	}

	public int getRows() {
		return rows;
	}
	
	public int getColumns() {
		return columns;
	}

	public void randomize() {
		Random random = new Random();
		
		for(int i = 0; i < (rows*columns)/10; i++) {
			int row = random.nextInt(rows);
			int col = random.nextInt(columns);
			
			setCell(row, col, true);
		}
	}

	public void clear() {
		for(int row = 0; row < rows; row++) {
			for(int col = 0; col < columns; col++) {
				setCell(row, col, false);
			}
		}
	}
	
	public void next() {
		for(int row = 0; row < rows; row++) {
			for( int col = 0; col < columns; col++) {
				System.out.println("(" + row + ", " + col + ")" );		
			}
		}
	}
	

	public void save(File selectedFile) throws IOException {

		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(selectedFile))){
			dos.writeInt(rows);
			dos.writeInt(columns);
			
			for(int row = 0; row < rows; row++) {
				for(int col = 0; col < columns; col++) {
					dos.writeBoolean(grid[row][col]);
				}
			}
		}
		
	}


	public void load(File selectedFile) throws IOException {

		try(DataInputStream dis = new DataInputStream(new FileInputStream(selectedFile))){
			int fileRows = dis.readInt();
			int fileCols = dis.readInt();
			
			for(int row = 0; row < fileRows; row++) {
				for(int col = 0; col < fileCols; col++) {
					boolean status = dis.readBoolean();
					
					if(row >= rows || col >= columns) {
						continue;
					}
					
					grid[row][col] = status;
				}
			}
			
			
		}		
	}
}
