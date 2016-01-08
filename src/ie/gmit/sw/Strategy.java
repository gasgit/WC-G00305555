package ie.gmit.sw;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

public interface Strategy {
	
	public Collection<String> parseHTML(String address) throws IOException;
	public Collection<String> parseFile(String file) throws IOException;



}
