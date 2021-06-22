import processing.core.*;

public class SierpinskiTriangleProcessing extends PApplet {

	private int sideStart = 1152;
	private int xStart = 0;
	private int yStart  = 1152;
	
	public void setup() {
		size(1152,1152);
	}
	
	public void draw() {
	}
	
	public void tri(int x, int y, int side) {
		
		int x2 = x + side/2;
		int y2 = y - side;
		
		int x3 = x + side;
		int y3 = y;
		
		stroke(0, 0, 255);
		
		triangle(x, y, x2, y2, x3, y3);
		
		side = side/2;
		
		if(side > 10) {
			tri(x,          y,      side);
			tri(x+ side,    y,      side);
			tri(x+(side/2), y-side, side);
		}
	}
	
	public void mousePressed() {
		tri(xStart, yStart, sideStart);
	}
}
