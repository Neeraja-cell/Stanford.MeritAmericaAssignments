package week2;

import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class DrawingLines extends GraphicsProgram {
	private GLine line;
public void run() {
	addMouseListeners();
}
public void mousePressed(MouseEvent e) {
	int x = e.getX();
	int y = e.getY();
	line = new GLine(x,y, x,y);
	add(line);
}
public void mouseDragged(MouseEvent e) {
	int x = e.getX();
	int y = e.getY();
	line.setEndPoint(x, y);
}
}
