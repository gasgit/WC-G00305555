package ie.gmit.sw.sort;

import java.util.Collection;
import java.util.Map;

/**
 * Removes words from map contained in collection
 * @author glen
 *
 */

public class IgnoreWords implements StrategySort  {
	
	/**
	 * Pass map and collection.<br>
	 * Remove words in collection from map;<br>
	 * Return the map<br>
	 */
	
	public Map<String,Integer> removeIgnoreWords(Map<String, Integer> map, Collection<String> col){
		
		map.keySet().removeAll(col);		
		
		return map;
		
		
	}

	public Map<String, Integer> frequencyCounter(Collection<String> coll) {
		return null;
	}
	

}
