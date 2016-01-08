package ie.gmit.sw;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import ie.gmit.sw.paint.CreateImage;
import ie.gmit.sw.sort.FrequencyCounter;
import ie.gmit.sw.sort.IgnoreWords;
import ie.gmit.sw.sort.Sort;

public class TestRunner {
	
	public static void main(String[] args) throws IOException {
		
		
		// create new fileParser from context
		
		Context c = new Context(new FileParser());
		
		Collection<String> textCollection = c.parseFile("testTextFile.txt");
		
		
		FrequencyCounter fc = new FrequencyCounter();
		IgnoreWords ig = new IgnoreWords();

	

		Map<String, Integer> textMap = fc.frequencyCounter(textCollection);
		

		Collection<String> ignWordsColllection = c.parseFile("stopwords.txt");	




//		c = new Context(new HTMLParser());
//		Collection<String> htmlCollection = c.parseHTML("http://www.thejournal.ie");
//		Map<String, Integer> htmltMap = fc.frequencyCounter(htmlCollection);

		
		Map<String, Integer> wordsRemoved = ig.removeIgnoreWords(textMap, ignWordsColllection);
		
		
		System.out.println("Parsed text file:\t " + c.parseFile("testTextFile.txt"));
		System.out.println("Ignore Words Collection: " + ignWordsColllection);
		System.out.println("Words Removed: \t\t " + wordsRemoved);
		
		CreateImage cimg = new CreateImage();
		cimg.drawMap(wordsRemoved);
		
		
		
			
		
	}

}
