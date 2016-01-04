package ie.gmit.sw.sort;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface Freqable {

	// pass list from fileParser  for now
	Map<String, Integer> freqCountText(Collection<String> list);

	// pass list from html parser for now
	Map<String, Integer> freqCountHTML(List<String> ls);

}