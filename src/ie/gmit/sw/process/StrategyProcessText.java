package ie.gmit.sw.process;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

public interface StrategyProcessText {
	
	Collection<String> createIGCollection(String file) throws IOException;
	Map<String, Integer> sortWords(Map<String, Integer> map, Collection<String> col);
	Collection<String> createTextCollection(String file) throws IOException;
	Map<String, Integer> fillTextMap(Collection<String> collection);




}
