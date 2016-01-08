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


public class CreateImage {
	

	private  Font font;	
	private  Random rn = new Random();
	private  BufferedImage image = new BufferedImage(720, 480, BufferedImage.TYPE_4BYTE_ABGR);
	
	private  Graphics graphics = image.getGraphics();
	


	
	public Map<String, Integer> drawMap(Map<String, Integer> passedMap) throws IOException{
		
		
		double total = (double) Collections.max(passedMap.values());	
		
		for (Map.Entry<String, Integer> e : passedMap.entrySet()) {
			
			float red, green,blue;
			red = (float)Math.random();
			green = (float)Math.random();
			blue = (float)Math.random();
			Color rdmColor = new Color(red, green,blue);
			
		    System.out.printf("String: %-16s  Occurences: %d \t\t Percentage: %.2f%%%n",
		    		e.getKey(), e.getValue(), e.getValue()/total*100);

			Integer value = e.getValue();
		     

		    if(passedMap.containsValue(value) ){
		    	
		  
		    	int x = rn.nextInt(720);
				int y = rn.nextInt(480);
				font = new Font(Font.SANS_SERIF, Font.ITALIC, e.getValue()*10);	
				graphics.setColor(rdmColor);
				graphics.setFont(font);			
				graphics.drawString(e.getKey(), x, y);					
					
			}
		
    
		}
			
				
		graphics.dispose();
		ImageIO.write(image, "png", new File("image.png"));
		return passedMap;
		}


	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
		

}
