package ie.gmit.sw;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import ie.gmit.sw.paint.CreateImage;
import ie.gmit.sw.sort.ContextSort;
import ie.gmit.sw.sort.FrequencyCounter;
import ie.gmit.sw.sort.IgnoreWords;

public class TestRunner {
	
	public static void main(String[] args) throws IOException {
		
		
		
		
		ContextParse c = new ContextParse(new FileParser());
		ContextSort cs = new ContextSort(new FrequencyCounter());

		
//		Collection<String> textCollection = c.parseFile("testTextFile.txt");
//		Map<String, Integer> textMap = cs.iNameThisMethodOrUseDelegateMethods(textCollection);
		

		Collection<String> ignWordsColllection = c.parseFile("stopwords.txt");	

//*****************************************************************************************************************************
		
		c = new ContextParse(new HTMLParser());
		
		Collection<String> htmlCollection = c.parseHTML("http://www.thejournal.ie");
		
		Map<String, Integer> htmltMap = cs.frequencyCounter(htmlCollection);

		
		
//*****************************************************************************************************************************
		
		cs = new ContextSort(new IgnoreWords());


		Map<String, Integer> wordsRemoved = cs.removeIgnoreWords(htmltMap, ignWordsColllection);
		//Map<String, Integer> wordsRemoved = cs.removeIgnoreWords(textMap, ignWordsColllection);

		
		
//*****************************************************************************************************************************
		
		System.out.println("Parsed text file:\t " + c.parseFile("testTextFile.txt"));
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

		
//*****************************************************************************************************************************
				
		
	}
	
	private static JFrame buildFrame() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(720, 480);
        frame.setVisible(true);
        return frame;
    }

	protected void finalize() throws Throwable {
		super.finalize();
	}
	

}
