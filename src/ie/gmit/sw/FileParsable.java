package ie.gmit.sw;

import java.io.IOException;
import java.util.Collection;

public interface FileParsable  {

	Collection<String> parseFile(String file) throws IOException;

}