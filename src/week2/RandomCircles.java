package week2;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class RandomCircles extends GraphicsProgram {
private static final int  NCIRCLES = 10;
private static final double MIN_RADIUS =5;
private static final double  MAX_RADIUS = 50;

private RandomGenerator rand = RandomGenerator.getInstance();
public void run() {
	
	for (int i = 0; i < 10; i++) {
		
		double r = rand.nextDouble(MIN_RADIUS,MAX_RADIUS);
		double x = rand.nextDouble(0,getWidth()-2 *r);
		double y = rand.nextDouble(0,getHeight()-2 *r);
		
		GOval circle = new GOval(x, y, 2 * r, 2 * r);
		 circle.setFilled(true);
		 circle.setColor(rand.nextColor());
		 add(circle); 

	}
	
	
	
}
}
