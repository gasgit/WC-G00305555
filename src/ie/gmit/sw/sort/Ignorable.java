package ie.gmit.sw.sort;

import java.util.Collection;
import java.util.Map;

public interface Ignorable {

	Map<String, Integer> removeIgnoreWords(Map<String, Integer> map, Collection<String> col);

}