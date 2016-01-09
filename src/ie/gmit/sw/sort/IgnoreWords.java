package ie.gmit.sw.sort;

import java.util.Collection;
import java.util.Map;

public class IgnoreWords implements StrategySort  {
	
	
	public Map<String,Integer> removeIgnoreWords(Map<String, Integer> map, Collection<String> col){
		
		map.keySet().removeAll(col);		
		
		return map;
		
		
	}

	public Map<String, Integer> frequencyCounter(Collection<String> coll) {
		return null;
	}
	

}
