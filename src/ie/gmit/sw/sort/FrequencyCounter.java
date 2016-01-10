package ie.gmit.sw.sort;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


/**
 * 
 * @author glen
 * 
 *
 * 
 *
 */




public class FrequencyCounter implements StrategySort  {
	

	
	private Map<String,Integer> counted = new TreeMap<>();
	
/**
 *  method to check the frequency of the words in passed collection
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
