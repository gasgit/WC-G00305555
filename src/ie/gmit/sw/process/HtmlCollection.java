package ie.gmit.sw.process;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import ie.gmit.sw.parse.ContextParse;
import ie.gmit.sw.parse.HTMLParser;

/**
 * Build collection htmlCollection to store words from parsed url
 * @author glen
 * 
 *
 */



public class HtmlCollection implements StrategyProcessText {
	

	 ContextParse c = new ContextParse(new HTMLParser());
	 Collection<String> htmlCollection;
 
	 /**
	  * 
	  * Method to parse url and return the words only in collection
	  * using the parseHTML() method from HTMLParser class<br/>
	  * ContextParse creates a new HTMLParser object<br/>
	  * Returns htmlCollection
	  * 
	  */
	 
	 public Collection<String> createTextCollection(String address) throws IOException{
		 
			htmlCollection = c.parseHTML(address);
			 
			return htmlCollection;
			 
			 
	 }

	@Override
	public Collection<String> createIGCollection(String file) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Integer> sortWords(Map<String, Integer> map, Collection<String> col) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Integer> fillTextMap(Collection<String> collection) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
