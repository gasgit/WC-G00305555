package ie.gmit.sw.sort;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FrequencyCounter  {
	
private Map<String,Integer> counted = new TreeMap<>();
	
	public Map<String,Integer> frequencyCounter(Collection<String> coll){
		
		Set<String> unique = new HashSet<String>(coll);
		
		for (String key : unique ) {
			
			counted.put(key, Collections.frequency(coll, key));
					
		}
		
		
		return counted;
		
	}

}
