package week2;

import acm.graphics.*;
import acm.program.*;
import acm.util.*;


public class RandomCircles extends GraphicsProgram {

	// Parameters for random circles
	public void run() {
		for (int i = 0; i < CIRCLESNO; i++) {
			double r = rgen.nextDouble(RADIUS_MIN, RADIUS_MAX);
			double circleArea = 2 * r;
			
			//Random circle variables
			double xStart = getWidth() - circleArea;
			double yStart = getHeight() - circleArea;
			double x = rgen.nextDouble(0, xStart);
			double y = rgen.nextDouble(0, yStart);
			
			// Random circle properties
			GOval circle = new GOval(x, y, circleArea, circleArea);
			circle.setFilled(true);
			circle.setFillColor(rgen.nextColor());
			add(circle);
		}
		
		
		
	}
	// instance variables
	private static final int CIRCLESNO = 10;
	private static final double RADIUS_MIN = 5;
	private static final double RADIUS_MAX = 50;
	
	private RandomGenerator rgen = RandomGenerator.getInstance();
}


