package ie.gmit.sw.process;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import ie.gmit.sw.parse.ContextParse;
import ie.gmit.sw.parse.HTMLParser;

/**
 * 
 * @author glen
 * 
 * build collection to store parsed html page
 *
 */



public class HtmlCollection implements StrategyProcessText {
	

	 ContextParse c = new ContextParse(new HTMLParser());
	 Collection<String> htmlCollection;
 
 /**
  * method is passed a url 
  * url passed to parseHTML method
  * returns map of words 
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
