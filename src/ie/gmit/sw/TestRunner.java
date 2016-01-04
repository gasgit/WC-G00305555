package ie.gmit.sw;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import ie.gmit.sw.sort.FrequencyCounter;
import ie.gmit.sw.sort.IgnoreWords;
import ie.gmit.sw.sort.Sort;

public class TestRunner {
	
	public static void main(String[] args) throws IOException {
		
		Context c = new Context(new FileParser());
		System.out.println("Test Fle Parser: " + c.parseFile("testTextFile.txt"));
		Collection<String> textMap = c.parseFile("testTextFile.txt");
		Collection<String> ignWords = c.parseFile("testIgnoreWordsFile.txt");
		
		c = new Context( new HTMLParser());
		
		System.out.println("Test HtmlParser: " + c.parseHTML("http://www.irishjobs.ie"));
		List<String> htmlMap = c.parseHTML("http://www.irishjobs.ie");
		
		Sort s = new Sort(new FrequencyCounter());
		
		Map<String, Integer> freqMapText = s.freqCountText(textMap);
		System.out.println("Test FreqMapText: " + freqMapText);
		
		Map<String,Integer> freqMapHtml = s.freqCountHTML(htmlMap);
		System.out.println("Test FreqMapHtml: " + freqMapHtml);
		
		s = new Sort(new IgnoreWords());
		
		
		Map<String, Integer> wordsRemoved = s.removeIgnoreWords(freqMapText, ignWords);
		System.out.println("Test Words Removed: " + wordsRemoved);
		
		
		
			
		
	}

}
