package week2;

import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class RobotFace extends GraphicsProgram {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void run() {
	int screenWidth = getWidth();
	int screenHeight = getHeight();
	int newX = screenWidth/2 -50;
 	int newY = screenHeight/2 -75;
 	
 	GRect rect = new GRect(newX, newY, 100, 150);
   
    rect.setFilled(true);
    rect.setColor(Color.GRAY);
    add(rect);
    
    int newLeftEyeX = screenWidth/2 -100/4 -20/2;
 	int newLeftEyeY = screenHeight/2 -150/4 -20/2;
 	GOval oval = new GOval(newLeftEyeX, newLeftEyeY, 20, 20);
 	 oval.setFilled(true);
     oval.setColor(Color.RED);
     add(oval);
     
   int newRightEyeX = screenWidth/2  + 100/4 -20/2;
   int newRightEyeY = screenHeight/2  -150/4 -20/2;
	GOval oval1= new GOval(newRightEyeX, newRightEyeY, 20, 20 );
    oval1.setFilled(true);
    oval1.setColor(Color.RED);
    add(oval1);
 	
    int newMouthX = screenWidth/2  -100/4 -10/2;
    int newMouthY = screenHeight/2  -150/4 +90/2;
 	GRect rect1= new GRect(newMouthX, newMouthY, 60, 20 );
     rect1.setFilled(true);
     rect1.setColor(Color.BLUE);
     add(rect1);
    
}
}
