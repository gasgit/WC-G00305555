package ie.gmit.sw.process;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

public class ContextProcess {
	
	StrategyProcessText pro;

	public ContextProcess(StrategyProcessText pro) {
		super();
		this.pro = pro;
	}

	public Collection<String> createIGCollection(String file) throws IOException {
		return pro.createIGCollection(file);
	}

	public Map<String, Integer> sortWords(Map<String, Integer> map, Collection<String> col) {
		return pro.sortWords(map, col);
	}

	public Collection<String> createTextCollection(String file) throws IOException {
		return pro.createTextCollection(file);
	}

	public Map<String, Integer> fillTextMap(Collection<String> collection) {
		return pro.fillTextMap(collection);
	}

	
	
	
	

}
