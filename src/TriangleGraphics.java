import javax.swing.*;
import java.awt.*;

public class TriangleGraphics extends JPanel {
	private Graphics2D g2D;
	private int sideStart = 1152;
	private int xStart = 0;
	private int yStart  = 1152;
	
	private int x;
	private int x2;
	private int x3;
			
	private int y;
	private int y2;
	private int y3;
	
	private int xs[];
	private int ys[];
	
	private int side = 1152;
	
	public TriangleGraphics() {
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2D = (Graphics2D) g;
		
		drawTriangle(xStart, yStart, sideStart);
		
		int[] xs = {x, x2, x3};
		int[] ys = {y, y2, y3};
		
		g2D.setColor(Color.MAGENTA);
		g2D.drawPolygon(xs, ys, 3);
		
		
//		g2D.setColor(Color.MAGENTA);
//		g2D.drawPolygon(xs, ys, 3);
		
//		while (side > 10) {
//			drawTriangle(x,          y,      side);
//			drawTriangle(x+ side,    y,      side);
//			drawTriangle(x+(side/2), y-side, side);
//			
//			side = side/2;
//		}
	}
	
	public void drawTriangle(int x, int y, int side) {
//		xs.length = 0;
//		ys.length = 0;
		
		this.x = x;
		this.y = y;
		
		this.x2 = x + side/2;
		this.y2 = y - side;
		
		this.x3 = x + side;
		this.y3 = y;
		
//		xs[0] = this.x;
//		xs[1] = x2;
//		xs[2] = x3;
//		ys[0] = this.y;
//		ys[1] = y2;
//		ys[2] = y3;
		
//		int[] xs = {x, x2, x3};
//		int[] ys = {y, y2, y3};
//		
//		g2D.setColor(Color.MAGENTA);
//		g2D.drawPolygon(xs, ys, 3);
	}
}
	

