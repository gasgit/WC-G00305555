package ie.gmit.sw.process;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import ie.gmit.sw.sort.ContextSort;
import ie.gmit.sw.sort.FrequencyCounter;

/**
 * Build a map to store words and frequency<br/>
 * @author glen
 * 	
 *
 */

public class WordFreqMap implements StrategyProcessText {
	
	private ContextSort cs = new ContextSort(new FrequencyCounter());
	private Map<String, Integer> textMap;
	
	/**
	 * Method is passed a collection words<br/>
	 * Returns map with words and frequency<br/>
	 * Calls the frequencyCounter() in FrequencyCounter Class<br/>
	 * ContextSort is used to create a new FrequencyCounter object<br/>
	 * Returns textMap of words and frequency<br/>
	 */
	public Map<String,Integer> fillTextMap(Collection<String> collection){
		
		 textMap = cs.frequencyCounter(collection);
		
		return textMap;
		
	}
	
	 

	public Collection<String> createIGCollection(String file) throws IOException {
		return null;
	}

	public Map<String, Integer> sortWords(Map<String, Integer> map, Collection<String> col) {
		return null;
	}

	public Collection<String> createTextCollection(String file) throws IOException {
		return null;
	}

}
