	package ie.gmit.sw.Runner;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import ie.gmit.sw.paint.CreateImage;
import ie.gmit.sw.parse.ContextParse;
import ie.gmit.sw.process.ContextProcess;
import ie.gmit.sw.process.HtmlCollection;
import ie.gmit.sw.process.IgnoreWordMap;
import ie.gmit.sw.process.IgnoreWordsCollection;
import ie.gmit.sw.process.TextCollection;
import ie.gmit.sw.process.WordFreqMap;
import ie.gmit.sw.sort.ContextSort;



/**
 * Class containing methods fileCloud(), htmlCloud() to create the wordsRemoved map that is
 * passed to the buildImage method.
 * @see #buildImage() 
 * 
 * @author glen
 *
 */

public class MethodRunner {
	

	protected MethodRunner() {
		super();
	}


	private  ContextParse c;
	private  ContextSort cs;
	private  ContextProcess cp;

	private  Collection<String> textCollection,ignWordsColllection,htmlCollection;
	private  Map<String, Integer> textMap,htmltMap,wordsRemoved;
	
	
	
//	Map<String,Integer> fileCloud() throws IOException{
//		
//		c = new ContextParse(new FileParser());
//	    cs = new ContextSort(new FrequencyCounter());
//		
//		textCollection = c.parseFile("testTextFile.txt");
//		textMap = cs.iNameThisMethodOrUseDelegateMethods(textCollection);
//		
//		fillIgnoreWords();
//
//
//		cs = new ContextSort(new IgnoreWords());
//
//		return wordsRemoved = cs.removeIgnoreWords(textMap, ignWordsColllection);
//		
//	}
	
	Map<String,Integer> fileCloud() throws IOException{
			
			
			String  textFileName =  "testTextFile.txt";
			String stopwords = "stopwords.txt";
			
	
			cp = new ContextProcess(new TextCollection());
			textCollection = cp.createTextCollection(textFileName);	
			
			cp = new ContextProcess(new WordFreqMap());
			textMap = cp.fillTextMap(textCollection);
			
			cp = new ContextProcess(new IgnoreWordsCollection());
		    ignWordsColllection = cp.createIGCollection(stopwords);
	
			cp = new ContextProcess(new IgnoreWordMap());
			return wordsRemoved = cp.sortWords(textMap, ignWordsColllection);
			
			
			
			
		}
	
	
	
//	Map<String,Integer> htmlCloud() throws IOException{
//		
//		String url = "http://www.thejournal.ie";
//		
//		c = new ContextParse(new HTMLParser());
//	    cs = new ContextSort(new FrequencyCounter());
//	
//		htmlCollection = c.parseHTML(url);
//		
//	    htmltMap = cs.frequencyCounter(htmlCollection);
//	    
//	    fillIgnoreWords();
//		cs = new ContextSort(new IgnoreWords());
//		
//		return  wordsRemoved = cs.removeIgnoreWords(htmltMap, ignWordsColllection);
//
//	
//	}
	/**
	 * Method to process html link to key value map of 
	 * words and the frequency
	 * 	
	 * @throws IOException if file I/O occurs
	 */
	Map<String,Integer> htmlCloud() throws IOException{
		
		String url = "http://www.thejournal.ie";
		String stopwords = "stopwords.txt";

		// craete new HtmlCollection cp 
		cp = new ContextProcess(new HtmlCollection());
		// pass the url, create collection and add to textCollection
		textCollection = cp.createTextCollection(url);	
		// create new WordFreqMap
		cp = new ContextProcess(new WordFreqMap());
		// pass texCollection to fill map
		textMap = cp.fillTextMap(textCollection);
		
		cp = new ContextProcess(new IgnoreWordsCollection());
	    ignWordsColllection = cp.createIGCollection(stopwords);

		cp = new ContextProcess(new IgnoreWordMap());
		return wordsRemoved = cp.sortWords(textMap, ignWordsColllection);
		
		
		
	}
	
/**
 * Method uses passes wordsRemoved map to CreateImage class to create the image<br/>
 * The image is returned from a getter and added to the JFrame here
 *  
 * @throws IOException
 */

	void buildImage() throws IOException{
		
		CreateImage cimg = new CreateImage();
		
		cimg.drawMap(wordsRemoved);

        final BufferedImage image = cimg.getImage();
        
        JFrame frame = buildFrame();

		JPanel pane = new JPanel() {
           
			private static final long serialVersionUID = 1L;

            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, null);
                
            }
        };
        frame.add(pane);
		
	}
	/**
	 * Method to create a new JFrame to place a panel to place the image
	 */
	
	private  JFrame buildFrame() {
		
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(720, 480);
        frame.setTitle("G00305555 Word Cloud");
        frame.setVisible(true);
        return frame;
    }

	/**
	 * Factory method allowing choice of method calls in the Menu Class
	 * 
	 */
	public static MethodRunner createNewRunner() {
		return new MethodRunner();
	}
	/**
	 * Garbage collecting
	 */

	protected void finalize() throws Throwable {
		super.finalize();
	}

}
