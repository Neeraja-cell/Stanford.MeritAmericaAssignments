package week4;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class ImageProcessing extends GraphicsProgram {
	
	//private static final int y_POS = 100;
	
	public void run() {
		GImage image  = new GImage("milkmaid.jpg");
		
		GImage flipHorizontalImage = createFlipHorizontalImage(image);
		
		flipHorizontalImage.scale(1,0);
		add(flipHorizontalImage,200,50);
	}
	
	private GImage createFlipHorizontalImage(GImage image) {
		// TODO Auto-generated method stub
		 int[][] array = image.getPixelArray(); 
		//width in pixels of each row of image
		//int width = array[0].length;
		int height = array.length;
		int [][] newarray = new int [height][];
		//loops through each row of the image
		for (int x = 0; x < height; x++) 
		{ int width = array[x].length;
		  newarray [x]= new int [width];
			
		for (int y = 0; y < width; y++)
			
		{ int pixel = array[x][y];
		newarray[x][width -y -1] = pixel;
				
		}
		 
		} 
		GImage newimage = new GImage(newarray);
		return newimage;
		
		}
	
}

	
	



