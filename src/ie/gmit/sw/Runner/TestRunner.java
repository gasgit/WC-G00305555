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
import ie.gmit.sw.parse.FileParser;
import ie.gmit.sw.process.ContextProcess;
import ie.gmit.sw.process.HtmlCollection;
import ie.gmit.sw.process.IgnoreWordMap;
import ie.gmit.sw.process.IgnoreWordsCollection;
import ie.gmit.sw.process.TextCollection;
import ie.gmit.sw.process.WordFreqMap;
import ie.gmit.sw.sort.ContextSort;
import ie.gmit.sw.sort.FrequencyCounter;
import ie.gmit.sw.sort.IgnoreWords;

/**
 * My Test Runner for testing purposes
 * 
 * @author glen
 *
 */




public class TestRunner {
	
	/**
	 * Main method to allow testing of different contexts and build image and frame
	 * @param args
	 * @throws IOException
	 */
	
	
	
	public static void main(String[] args) throws IOException {
		
		 ContextParse c;
		 ContextSort cs;
		 ContextProcess cp;
		 Collection<String> textCollection,ignWordsColllection,htmlCollection;
		 Map<String, Integer> textMap,htmltMap, wordsRemoved;
		 MethodRunner nr;

		 
// ********************    for testing only uncomment one context ata a time     ************************************************************ 
		 
//**************************    uncomment to test  context process for textfile  ************************************************************

		 
//		String  textFileName =  "testTextFile.txt";
//		String stopwords = "stopwords.txt";
//		
//
//		cp = new ContextProcess(new TextCollection());
//		textCollection = cp.createTextCollection(textFileName);	
//		
//		cp = new ContextProcess(new TextFreqMap());
//		textMap = cp.fillTextMap(textCollection);
//		
//		cp = new ContextProcess(new IgnoreWordsCollection());
//	    ignWordsColllection = cp.createIGCollection(stopwords);
//
//		cp = new ContextProcess(new IgnoreWordMap());
//		wordsRemoved = cp.sortWords(textMap, ignWordsColllection);
		
		
		
	
		
//************************************  uncomment to test  context process foe html ***********************************************************

//		
//		String url = "http://www.thejournal.ie";
//		String stopwords = "stopwords.txt";
//
//		
//		cp = new ContextProcess(new HtmlCollection());
//		textCollection = cp.createTextCollection(url);	
//		
//		cp = new ContextProcess(new TextFreqMap());
//		textMap = cp.fillTextMap(textCollection);
//		
//		cp = new ContextProcess(new IgnoreWordsCollection());
//	    ignWordsColllection = cp.createIGCollection(stopwords);
//
//		cp = new ContextProcess(new IgnoreWordMap());
//		wordsRemoved = cp.sortWords(textMap, ignWordsColllection);
//		
		
		 
//*******************************************  uncomment to test context Parse file ***************************************************************************

		 
		 
			c = new ContextParse(new FileParser());
			textCollection = c.parseFile("testTextFile.txt");
		    cs = new ContextSort(new FrequencyCounter());
			textMap = cs.iNameThisMethodOrUseDelegateMethods(textCollection);
			ignWordsColllection = c.parseFile("stopwords.txt");		
			cs = new ContextSort(new IgnoreWords());
			wordsRemoved = cs.removeIgnoreWords(textMap, ignWordsColllection);

		

//*******************************************  uncomment to test context Parse url ***************************************************************************

		 
		 
//		String url = "http://www.thejournal.ie";	
//		c = new ContextParse(new HTMLParser());
//		htmlCollection = c.parseHTML(url);
//		cs = new ContextSort(new FrequencyCounter());
//	    htmltMap = cs.frequencyCounter(htmlCollection);
//	    c = new ContextParse(new FileParser());
//		ignWordsColllection = c.parseFile("stopwords.txt");	
//		cs = new ContextSort(new IgnoreWords());
//		wordsRemoved = cs.removeIgnoreWords(htmltMap, ignWordsColllection);



		
//*****************************************************************************************************************************
		
		System.out.println("Ignore Words Collection: " + ignWordsColllection);
		System.out.println("Words Removed: \t\t " + wordsRemoved);

//*****************************************************************************************************************************

		
		CreateImage cimg = new CreateImage();
		
		cimg.drawMap(wordsRemoved);
		
		
//********************************************************************************************************************		
		
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
	

	private static JFrame buildFrame() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(720, 480);
        frame.setTitle("G00305555 Word Cloud");

        frame.setVisible(true);
        return frame;
    }

	protected void finalize() throws Throwable {
		super.finalize();
	}
	
	

}
