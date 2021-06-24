import java.awt.Color;
import javax.swing.*;

/**
 * This class created frame on which is drawn.
 * 
 * @author joeysmeets, anniegyn
 * @version 24 June 2021
 */

public class Frame extends JFrame {
	TriangleGraphics graphics = new TriangleGraphics();
	
	public static void main(String[] args) {
		Frame frame = new Frame();
	}

	/**
	 * Constructor.
	 * Creates a frame with max width and height for the biggest possible 
	 * equilateral triangle on a 2048 X 1152 resolution display.
	 * @width 1330
	 * @height 1152
	 * @background Black
	 */
	public Frame() {
		this.setSize(1330, 1152);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.BLACK);
		this.add(graphics);
		this.setVisible(true);
	}
}
