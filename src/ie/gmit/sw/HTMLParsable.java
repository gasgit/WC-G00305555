package ie.gmit.sw;

import java.io.IOException;
import java.util.Collection;

public interface HTMLParsable {

	Collection<String> parseHTML(String address) throws IOException;

}