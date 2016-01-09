package ie.gmit.sw.sort;

import java.util.Collection;
import java.util.Map;

public interface StrategySort {
	
	public  Map<String, Integer> frequencyCounter(Collection<String> coll);
	public Map<String, Integer> removeIgnoreWords(Map<String, Integer> map, Collection<String> col);


	

}
