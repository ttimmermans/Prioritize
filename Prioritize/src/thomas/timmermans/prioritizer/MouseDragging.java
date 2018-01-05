package thomas.timmermans.prioritizer;

import java.awt.Color;

/**
 * Customizing JTextField link:
 * https://stackoverflow.com/questions/6008058/customizing-jtextfield
 * 
 * @author ttimmermans
 */
public class MouseDragging {

	public static void main(String[] args) {
		
		Canvas canvas = new Canvas("MouseDragging", 480, 640);
		
		Block block1 = new Block(0, 80, Color.BLUE, canvas);
		Block block2 = new Block(120, 200, Color.RED, canvas);
		Block block3 = new Block(350, 400, Color.GREEN, canvas);

	}

}