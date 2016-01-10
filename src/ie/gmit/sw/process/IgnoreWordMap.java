package ie.gmit.sw.process;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import ie.gmit.sw.sort.ContextSort;
import ie.gmit.sw.sort.IgnoreWords;


/**
 * 
 * @author glen
 *  create IgnoreWordMap to store map with ignore words removed
 *
 */

public class IgnoreWordMap implements StrategyProcessText {
	
	private ContextSort cs = new ContextSort(new IgnoreWords());
	private Map<String,Integer> wordsRemoved;
	
	/**
	 * method sortWords passed map of words and collection of words to ignore
	 * method to compare words removed 
	 */
	
	public Map<String,Integer> sortWords(Map<String,Integer> map, Collection<String> col){
		
		wordsRemoved = cs.removeIgnoreWords(map, col);
		
		return wordsRemoved;
		
	}

	public Collection<String> createIGCollection(String file) throws IOException {
		return null;
	}

	public Collection<String> createTextCollection(String file) throws IOException {
		return null;
	}

	public Map<String, Integer> fillTextMap(Collection<String> collection) {
		return null;
	}

}
