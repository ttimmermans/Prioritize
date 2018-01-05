package thomas.timmermans.prioritizer;

import java.awt.Color;
import java.util.ArrayList;

public class Block {
	
	private static final int LENGTH = 50;
	private static final ArrayList<Block> BLOCKLIST = new ArrayList<>();
	
	private final Canvas canvas;
	
	private Color color;
	
	private int x;	// x-coordinate of this block
	private int y;	// y-coordinate of this block
	
	/**
	 * Constructor
	 * @param x
	 * @param y
	 * @param color
	 * @param canvas
	 */
	public Block(int x, int y, Color color, Canvas canvas) {
        this.x = x;
        this.y = y;
        this.color = color;
		canvas.setForegroundColor(color);
		this.canvas = canvas;
		canvas.fillRectangle(x, y, LENGTH, LENGTH);
		BLOCKLIST.add(this);
	}

	/**
	 * Set a new position of x, y coordinates for this block
	 */
	public void setXY(int newX, int newY) {
		this.x = newX;
		this.y = newY;
	}
	
	/**
	 * Return x-position of this block
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Return y-position of this block
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Return the length of this block
	 * @return	This block's length
	 */
	public int getLength() {
		return LENGTH;
	}
	
	/**
	 * Return the color of this block
	 * @return	This block's color
	 */
	public Color getColor() {
		return color;
	}
	
	/**
	 * Return the BLOCKLIST
	 * @return	the BLOCKLIST
	 */
	public static ArrayList<Block> getBlockList() {
		return BLOCKLIST;
	}

}