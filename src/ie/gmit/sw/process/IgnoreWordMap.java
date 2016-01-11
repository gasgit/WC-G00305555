package ie.gmit.sw.process;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import ie.gmit.sw.sort.ContextSort;
import ie.gmit.sw.sort.IgnoreWords;


/**
 * 
 * Create wordsRemoved map to store map with ignore words removed
 * 
 * @author glen
 *
 */

public class IgnoreWordMap implements StrategyProcessText {
	
	private ContextSort cs = new ContextSort(new IgnoreWords());
	private Map<String,Integer> wordsRemoved;
	
	/**
	 * Method sortWords passed map and collection of words<br/>
	 * ContextSort creates a new IgnoreWords object used to remove the ignore words<br/>
	 * Returns wordsRemoved map
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
