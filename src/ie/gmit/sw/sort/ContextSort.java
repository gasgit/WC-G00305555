package ie.gmit.sw.sort;

import java.util.Collection;
import java.util.Map;

public class ContextSort {
	
	private StrategySort sort;

	public ContextSort(StrategySort sort) {
		super();
		this.sort = sort;
	}
	
	public Map<String, Integer> iNameThisMethodOrUseDelegateMethods(Collection<String> coll){
		return sort.frequencyCounter(coll);
		
	}
	

	public Map<String, Integer> frequencyCounter(Collection<String> coll) {
		return sort.frequencyCounter(coll);
	}


	public Map<String, Integer> removeIgnoreWords(Map<String, Integer> map, Collection<String> col) {
		return sort.removeIgnoreWords(map, col);
	}


	protected void finalize() throws Throwable {
		super.finalize();
	}
	
	
	

}
