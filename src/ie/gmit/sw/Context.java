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

	public List<String> parseHTML(String address) throws IOException {
		return strat.parseHTML(address);
	}

	public Collection<String> parseFile(String file) throws IOException {
		return strat.parseFile(file);
	}
	
	
	
//	private FileParsable fp;
//	private HTMLParsable hp;
//
//	public Context(HTMLParsable hp) {
//		super();
//		this.hp = hp;
//	}
//	
//	public Context(FileParsable fp) {
//		super();
//		this.fp = fp;
//	}
//	
//	public Collection<String> parseFile(String file) throws IOException {
//		return fp.parseFile(file);
//	}
//
//	public List<String> parseHTML(String address) throws IOException {
//		return hp.parseHTML(address);
//	}


}
