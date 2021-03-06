package ie.gmit.sw.parse;

import java.io.IOException;
import java.util.Collection;

/**
 * ContestParse to allow selecting which type of parser to use
 * @author glen
 *
 */


public class ContextParse {
	
	private StrategyParse strat;
	
	
	public ContextParse(StrategyParse strat) {
		super();
		this.strat = strat;
	}

	public Collection<String> parseHTML(String address) throws IOException {
		return strat.parseHTML(address);
	}

	public Collection<String> parseFile(String file) throws IOException {
		return strat.parseFile(file);
	}

	protected void finalize() throws Throwable {
		super.finalize();
	}

	

}
