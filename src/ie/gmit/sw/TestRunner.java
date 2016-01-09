package ie.gmit.sw;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import ie.gmit.sw.paint.CreateImage;
import ie.gmit.sw.sort.ContextSort;
import ie.gmit.sw.sort.FrequencyCounter;
import ie.gmit.sw.sort.IgnoreWords;

public class TestRunner {
	
	public static void main(String[] args) throws IOException {
		
		
		
		
		
		ContextParse c = new ContextParse(new FileParser());
		
		Collection<String> textCollection = c.parseFile("testTextFile.txt");
		
		ContextSort cs = new ContextSort(new FrequencyCounter());
		

		Map<String, Integer> textMap = cs.iNameThisMethodOrUseDelegateMethods(textCollection);
		

		Collection<String> ignWordsColllection = c.parseFile("stopwords.txt");	

//*****************************************************************************************************************************
		
		c = new ContextParse(new HTMLParser());
		
		Collection<String> htmlCollection = c.parseHTML("http://www.thejournal.ie");
		
		Map<String, Integer> htmltMap = cs.frequencyCounter(htmlCollection);

		cs = new ContextSort(new IgnoreWords());
		
		
//*****************************************************************************************************************************
		

		Map<String, Integer> wordsRemoved = cs.removeIgnoreWords(htmltMap, ignWordsColllection);
		
		
//*****************************************************************************************************************************
		
		System.out.println("Parsed text file:\t " + c.parseFile("testTextFile.txt"));
		System.out.println("Ignore Words Collection: " + ignWordsColllection);
		System.out.println("Words Removed: \t\t " + wordsRemoved);

//*****************************************************************************************************************************

		
		CreateImage cimg = new CreateImage();
		
		cimg.drawMap(wordsRemoved);
		
		
//*****************************************************************************************************************************
		
		
			
		
	}

}
