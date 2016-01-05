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

public class Drawing {
	
	private  Font font;	
	private  Random rn = new Random();
	private  BufferedImage image = new BufferedImage(720, 480, BufferedImage.TYPE_4BYTE_ABGR);
	
	private  Graphics graphics = image.getGraphics();
	
	
	private Values val = new Values(0, 0, 0, 0, 0);

	
	public Map<String, Integer> drawMap(Map<String,Integer> map) throws IOException{
		
		val.setMax(Collections.max(map.values()));
		
		System.out.println("Max: " + val.getMax());
		val.setMin(Collections.min(map.values()));
		System.out.println("Min: " + val.getMin());
		val.calcMid();
		val.calcQtr();
		val.calcQte();
		
		
		System.out.println("Mid: " + val.getMid());
		System.out.println("Qtr" + val.getQtr());
		System.out.println("Qte" + val.getQte());	
		
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			String key0 = e.getKey();
			Integer value0 = e.getValue();
		     
		     System.out.println("This is E: " + e);
		     System.out.println("This is val: " + val.getMax());
		     System.out.println("This is Key: " + key0);
		     System.out.println("This is value: " + value0);
		    	     
		    if(map.containsValue(value0) && value0 == val.getMax()){
		    		    	
		    	int x = rn.nextInt(680);
				int y = rn.nextInt(480);
				font = new Font(Font.SANS_SERIF, Font.ITALIC, 82);				
				graphics.setColor(Color.green);
				graphics.setFont(font);			
				graphics.drawString(key0, x, y);					
				//y+=20;
					
			}
		}
		
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			
			String key1 = e.getKey();
			Integer value1 = e.getValue();
		     
		     if(map.containsValue(value1) && value1 == val.getQte()){
		    		    	
		    	 int x = rn.nextInt(680);
					int y = rn.nextInt(480);
		    	// x+=50;
		    	font = new Font(Font.SANS_SERIF, Font.ITALIC, 62);
		 		graphics.setFont(font);
		 		graphics.setColor(Color.yellow);
		 		graphics.drawString(key1, x, y);
		 		//y+=20;
		    	 
		     }
		     
		}
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			
			String key2 = e.getKey();
			Integer value2 = e.getValue();
		    if(map.containsValue(value2) && value2 == val.getMid()){
		    	
		    	
		    	int x = rn.nextInt(680);
				int y = rn.nextInt(480);
		    	//x+=60;
		    	font = new Font(Font.MONOSPACED, Font.PLAIN, 42);
		 		graphics.setFont(font);
		 		graphics.setColor(Color.blue);
		 		graphics.drawString(key2, x, y);
		    	 
		    	    	 
		    }
						     
		}
		for (Map.Entry<String, Integer> e : map.entrySet()) {
					
					String key3 = e.getKey();
					Integer value3 = e.getValue();
				    if(map.containsValue(value3) && value3 == val.getQtr()){
				    				    	
				    	int x = rn.nextInt(720);
						int y = rn.nextInt(480);
				    	//x+=60;
				    	font = new Font(Font.MONOSPACED, Font.TYPE1_FONT, 32);
				 		graphics.setFont(font);
				 		graphics.setColor(Color.white);
				 		graphics.drawString(key3, x, y);
				    	 
				    	    	 
				    }
					     
		}
		
		for (Map.Entry<String, Integer> e : map.entrySet()) {
					
					String key4 = e.getKey();
					Integer value4 = e.getValue();
				    if(map.containsValue(value4) && value4 == val.getMin()){
				    	
				    	
				    	int x = rn.nextInt(720);
						int y = rn.nextInt(480);
				    	//x+=60;
				    	font = new Font(Font.MONOSPACED, Font.ITALIC,22);
				 		graphics.setFont(font);
				 		graphics.setColor(Color.red);
				 		graphics.drawString(key4, x, y);
				    	 
				    	    	 
				    }
								     
		}
				
		graphics.dispose();
		ImageIO.write(image, "png", new File("image.png"));
		return map;
		}
		
		
		
}



