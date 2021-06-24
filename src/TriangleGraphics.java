import javax.swing.*;
import java.awt.*;

/**
 * This class created the figures and recursion to be drawn on the frame.
 * @author joeysmeets, anniegyn
 * @version 24 June 2021
 */

public class TriangleGraphics extends JPanel {
	private int maxDepth = 9;
	private int xSideStart = 1330; // max width  that fits biggest equilateral triangle on a 2048 X 1152 resolution.
	private int ySideStart = 1152; // max height that fits biggest equilateral triangle on a 2048 X 1152 resolution.
	private int xStart = 0;		   // starting point of the drawing, bottom right corner of the frame
	private int yStart  = 1152;    
	
	// Color Array for go over when filling the triangles.
	private Color[] colors = {
			new Color(0xfff100),  // yellow 
			new Color(0xff8C00),  // orange
			new Color(0xe81123),  // red
			new Color(0xec008c),  // pink
			new Color(0x68217a),  // purple
			new Color(0x00188f),  // navy
			new Color(0x00bcf2),  // blue
			new Color(0x00b294),  // turquoise
			new Color(0xbad80a),};// green
	
	/**
	 * Paint method, this is used by the drawing methods.
	 * @param Graphics g
	 */
	public void paint(Graphics g){
		int x = xStart;
		int y = yStart;
		
		int x2 = x + xSideStart/2;
		int y2 = y - ySideStart;
		
		int x3 = x + xSideStart;
		int y3 = y;
		
		int[] xArray = {x, x2, x3};
		int[] yArray = {y, y2, y3};
		
//		drawTriangle(g, xArray, yArray, 1);
		drawRecursively(g, xArray, yArray, 1);
	}
	
	/**
	 * Draws a single triangle at the given coordinates. 
	 * Outlines is black, filled in with a color of the color Array. 
	 * @param Graphics g
	 * @param int[] x
	 * @param int[] y
	 * @param level
	 */
	private void drawTriangle(Graphics g, int[] x, int[] y, int level) {
		Polygon p = new Polygon(x, y, 3);
		g.setColor(Color.BLACK);
		g.drawPolygon(p);
		g.setColor(colors[level%colors.length]);
		g.fillPolygon(p);
	}
	
	/**
	 * Draws the triangle pattern recursively.
	 * If the depth is smaller than the maxDepth (9), the recursion stops.
	 * @param Graphics g
	 * @param int[] x
	 * @param int[] y
	 * @param level
	 */
	private void drawRecursively(Graphics g, int[] x, int[] y, int depth){
        drawTriangle(g, x, y, depth);
        depth = depth + 1;
        if(depth < maxDepth) {
            int x1 = (x[0] + x[1]) / 2;
            int y1 = (y[0] + y[1]) / 2;
            
            int x2 = (x[1] + x[2]) / 2;
            int y2 = (y[1] + y[2]) / 2;
            
            int x3 = (x[0] + x[2]) / 2;
            int y3 = (y[0] + y[2]) / 2;
            
            // drawing three triangles inside of each of the bigger three triangles.
            drawRecursively(g, new int[]{x1, x[1], x2}, new int[]{y1, y[1], y2}, depth);
            drawRecursively(g, new int[]{x[0], x1, x3}, new int[]{y[0], y1, y3}, depth);
            drawRecursively(g, new int[]{x3, x2, x[2]}, new int[]{y3, y2, y[2]}, depth);
        }
    }
}