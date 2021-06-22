import javax.swing.*;

public class Frame extends JFrame {
	
	TriangleGraphics graphics = new TriangleGraphics();

	public Frame() {
		this.setSize(1152, 1152);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(graphics);
		this.setVisible(true);
	}
}
