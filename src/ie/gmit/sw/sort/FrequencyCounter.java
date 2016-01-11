package ie.gmit.sw.sort;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


/**
 * Build a map to store words and frequency
 * @author glen
 * 
 *
 * 
 *
 */

public class FrequencyCounter implements StrategySort  {
	

	
	private Map<String,Integer> counted = new TreeMap<>();
	
/**
 *  Method to check the frequency of the words in passed collection<br>
 *  Pass a collection of words<br>
 *  Create new TreeMap called counted<br>
 *  Create a set called unique and pass it the collection.<br> 
 *  Iterate over unique and add key and frequency count to counted.<br>
 *  Returns Counted
 * 
 */
	
	public Map<String,Integer> frequencyCounter(Collection<String> coll){
		
		Set<String> unique = new HashSet<String>(coll);
		
		for (String key : unique ) {
			
			counted.put(key, Collections.frequency(coll, key));
					
		}
				
		return counted;
		
	}

	public Map<String, Integer> removeIgnoreWords(Map<String, Integer> map, Collection<String> col) {
		return null;
	}

}
