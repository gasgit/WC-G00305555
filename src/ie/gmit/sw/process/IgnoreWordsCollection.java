package ie.gmit.sw.process;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import ie.gmit.sw.parse.ContextParse;
import ie.gmit.sw.parse.FileParser;


/**
 * Build collection called ignoeWordsCollection to store words 
 * parsed from a url
 * @author glen
 * 
 *
 */

public class IgnoreWordsCollection implements StrategyProcessText{
	
	ContextParse c = new ContextParse(new FileParser());
	Collection<String> ignWordsColllection;
	
	/**
	  * 
	  * Method to parse file with words to ignore and return in collection
	  * Uses the parseFile() method from FileParser class<br/>
	  * ContextParse creates a new FileParser object<br/>
	  * Returns ignWordsColllection
	  * 
	  */
	public Collection<String> createIGCollection (String file) throws IOException{
		 
		ignWordsColllection = c.parseFile(file);
		 
		return ignWordsColllection;
		 
		 
	 }


	public Map<String, Integer> sortWords(Map<String, Integer> map, Collection<String> col) {
		return null;
	}


	public Collection<String> createTextCollection(String file) throws IOException {
		return null;
	}


	public Map<String, Integer> fillTextMap(Collection<String> collection) {
		return null;
	}
	 

}
