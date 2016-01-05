package ie.gmit.sw.sort;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Sort {
	
	
	private Freqable freq;
	
	private Ignorable ignore;
	
	
	
	public Map<String, Integer> freqCountText(Collection<String> list) {
		return freq.freqCountText(list);
	}


	public Map<String, Integer> freqCountHTML(List<String> ls) {
		return freq.freqCountHTML(ls);
	}


	public Map<String, Integer> removeIgnoreWords(Map<String, Integer> map, Collection<String> col) {
		return ignore.removeIgnoreWords(map, col);
	}


	public Sort(Freqable freq) {
		super();
		this.freq = freq;
	}


	public Sort(Ignorable ignore) {
		super();
		this.ignore = ignore;
	}
	
	
	
	
	
	
	

}
