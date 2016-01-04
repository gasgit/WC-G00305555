package ie.gmit.sw.sort;

import java.util.Collection;
import java.util.Map;

public class IgnoreWords implements Ignorable {
	
	//Map<String, Integer> newMapp;
	
	public Map<String,Integer> removeIgnoreWords(Map<String, Integer> map, Collection<String> col){
		
		map.keySet().removeAll(col);		
		
		return map;
		
		
	}
	

}
