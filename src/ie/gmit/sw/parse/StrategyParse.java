package ie.gmit.sw.parse;

import java.io.IOException;
import java.util.Collection;

public interface StrategyParse {
	
	public Collection<String> parseHTML(String address) throws IOException;
	public Collection<String> parseFile(String file) throws IOException;



}
