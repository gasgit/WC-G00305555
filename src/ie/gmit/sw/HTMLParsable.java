package ie.gmit.sw;

import java.io.IOException;
import java.util.List;

public interface HTMLParsable {

	List<String> parseHTML(String address) throws IOException;

}