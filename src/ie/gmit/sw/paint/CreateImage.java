package ie.gmit.sw.paint;

import java.awt.Color;


import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;

/**
 * Class to create image
 * 
 * @author glen
 *
 */
public class CreateImage {
	

	private  Font font;	
	private  Random rn = new Random();
	private  BufferedImage image = new BufferedImage(720, 480, BufferedImage.TYPE_4BYTE_ABGR);
	
	private  Graphics graphics = image.getGraphics();
	
	/**
	 * The drawMap method loops over a passed map.Map<String,Integer> passedMap<br>
	 * Extracts key value pairs - word/frequency and creates the image using random values.<br>
	 * The word font size to draw is calculated by getting the frequency value and *10<br>
	 * 
	 * 
	 * Variables<br>
	 * 
	 * passedMap - for the key/value - word/frequency<br/>
	 * total - set total to the max value in collection, highest frequency value<br/>
	 * red - to set random float r value for (RGB)<br/>
	 * green -  to set random float g value for (RGB)<br/>
	 * blue -  to set random float b value for (RGB)<br/>
	 * x - the x coordinate.<br/>
	 * x - the y coordinate.<br/>
	 * 
	 * @throws  IOException If an I/O  error occurs.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	public Map<String, Integer> drawMap(Map<String, Integer> passedMap) throws IOException{
		
		// set total to the max value in collection, highest frequency value
		double total = (double) Collections.max(passedMap.values());	
		// iterate over map and get key and value
		for (Map.Entry<String, Integer> e : passedMap.entrySet()) {
			// set random values to colors
			float red, green,blue;
			red = (float)Math.random();
			green = (float)Math.random();
			blue = (float)Math.random();
			Color rdmColor = new Color(red, green,blue);
			// print key, frequency and percentage
		    System.out.printf("Key: %-26s  Frequency: %d \t\t Percentage: %.2f%%%n",
		    		e.getKey(), e.getValue(), e.getValue()/total*100);
		    
			Integer value = e.getValue();
		     
			// if map contains the value select random position, set font to frequency value * 10
			// select random color and draw the key
		    if(passedMap.containsValue(value) ){
		    		  
		    	int x = rn.nextInt(720);
				int y = rn.nextInt(480);
				font = new Font(Font.SANS_SERIF, Font.ITALIC, e.getValue()*10);	
				graphics.setColor(rdmColor);
				graphics.setFont(font);			
				graphics.drawString(e.getKey(), x, y);					
					
			}
		  
		}
		// close graphic and write the image			
		graphics.dispose();
		ImageIO.write(image, "png", new File("image.png"));
		return null;
		}
	/**
	 * Getter for image
	 * 
	 * @return image 
	 * <br/>
	 * used in the buildImage() method in MethodRunner Class
	 */
	public BufferedImage getImage() {
		return image;
	}
	
	/**
	 * Setter for image
	 * @param image
	 * 
	 */
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	/**
	 * 
	 * Finalize for the GC 
	 * 
	 */


	protected void finalize() throws Throwable {
		super.finalize();
	}
		

}
