package week4;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class ImageProcessing extends GraphicsProgram {
	
	//private static final int y_POS = 100;
	
	public void run() {
		
		 
		
	GImage image  = new GImage("milkmaid.jpg");
		
	GImage flipHorizontalImage = createFlipHorizontalImage(image);
		
		flipHorizontalImage.scale(1,0);
	add(flipHorizontalImage, 200, 50);   
	
	}

	private GImage createFlipHorizontalImage(GImage image) {
		// TODO Auto-generated method stub
		int[][] array = image.getPixelArray();
		int width = array[0].length;
		int height = array.length;
		for (int row = 0; row < height; row++) {
		for (int p1 = 0; p1 < width / 2; p1++) {
		int p2 = width - p1 - 1;
		int temp = array[row][p1];
		array[row][p1] = array[row][p2];
		array[row][p2] = temp;
		}
		}
		return new GImage(array);
		}

}
	



