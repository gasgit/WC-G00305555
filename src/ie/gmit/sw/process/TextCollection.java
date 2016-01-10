package ie.gmit.sw.process;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import ie.gmit.sw.parse.ContextParse;
import ie.gmit.sw.parse.FileParser;

/**
 * 
 * @author glen
 * 
 * build collection to store words from parsed file
 *
 */

public class TextCollection implements StrategyProcessText {
	
	 ContextParse c = new ContextParse(new FileParser());
	 Collection<String> textCollection;
	
	 
 /**
  * method to parse file and return in collection
  * 
  */
	

	public Collection<String> createTextCollection(String file) throws IOException{
		 
		textCollection = c.parseFile(file);
		 
		return textCollection;
		 
		 
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
