package ie.gmit.sw;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class Context {
	
	private Strategy strat;

	public Context(Strategy strat) {
		super();
		this.strat = strat;
	}

	public Collection<String> parseHTML(String address) throws IOException {
		return strat.parseHTML(address);
	}

	public Collection<String> parseFile(String file) throws IOException {
		return strat.parseFile(file);
	}
	
	
	




}
