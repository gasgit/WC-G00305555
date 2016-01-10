package ie.gmit.sw.jtest;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Collection;

import org.junit.Test;

import ie.gmit.sw.parse.HTMLParser;

public class TestHTMLParser {

	@Test
	public void testHtmlParser() throws IOException {
		
		HTMLParser tHp = new HTMLParser();
		
		String url = new String("http://www.google.ie");

		
		
		Collection<String> collectionH = tHp.parseHTML(url);
		
		System.out.println(collectionH);
		
		assertEquals(true, collectionH.contains("google"));
			
	
	}

}
