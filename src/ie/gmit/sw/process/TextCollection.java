package ie.gmit.sw.process;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import ie.gmit.sw.parse.ContextParse;
import ie.gmit.sw.parse.FileParser;

/**
 * Build collection called textCollection to store words 
 * @author glen
 * 
 *
 */
public class TextCollection implements StrategyProcessText {
	
	 ContextParse c = new ContextParse(new FileParser());
	 Collection<String> textCollection;
	
	 
	 /**
	  * 
	  * Method to parse file and return in collection
	  * using the parseFile() method from FileParser class<br/>
	  * ContextParse creates a new FileParser object<br/>
	  * Returns textCollection
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
