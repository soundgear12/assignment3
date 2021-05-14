package week2;

import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.awt.event.*;





public class DrawingLines extends GraphicsProgram {

	public void run() {
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e1) {
		double x = e1.getX();
		double y = e1.getY();
		
		line = new GLine(x, y, x, y);
		add(line);
	}
	
	public void mouseDragged(MouseEvent e2) {
		double x = e2.getX();
		double y = e2.getY();
		line.setEndPoint(x, y);
	}


	
	private GLine line;
}
