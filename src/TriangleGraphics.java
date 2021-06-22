import javax.swing.*;
import java.awt.*;

public class TriangleGraphics extends JPanel {

	
	public TriangleGraphics() {
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.setColor(Color.MAGENTA);
		g2D.drawLine(0, 0, 400, 400);
	}
}
