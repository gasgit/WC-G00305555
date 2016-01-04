package ie.gmit.sw.sort;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FrequencyCounter implements Freqable {
	
	// create new map
	private Map<String,Integer> mmap = new HashMap<String, Integer>();

	
	// pass list from fileParser  for now
	public Map<String, Integer> freqCountText(Collection<String> list ){
		// put list to set and get freq of word
		Set<String> unique = new HashSet<String>(list);
		
		for (String key : unique ) {
			
			mmap.put(key, Collections.frequency(list, key));
					
		}
		

		 Map<String, Integer> treeMap = new TreeMap<String, Integer>(mmap);

		
		
		return treeMap;
		
	}
	
	// pass list from html parser for now
	public Map<String, Integer> freqCountHTML(List<String> ls ){
		// put list to set and get freq of word
		Set<String> unique = new HashSet<String>(ls);
		
		for (String key : unique ) {
		   // System.out.println(key + ": " + Collections.frequency(ls, key));
			
			mmap.put(key, Collections.frequency(ls, key));
			
			
		}
		// sort by adding to treeMap
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(mmap);		
		
		return treeMap;
		
	}
	
	
	
	

}
