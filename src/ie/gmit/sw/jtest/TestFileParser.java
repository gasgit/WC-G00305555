package ie.gmit.sw.jtest;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Collection;

import org.junit.Test;

import ie.gmit.sw.parse.FileParser;

public class TestFileParser  {
	
	 @Test
	    public void testParse() throws IOException {
		 
	        FileParser tFp = new FileParser();
	        
	        Collection<String> collection = tFp.parseFile("txtTestFileParser.txt");
	        
	        System.out.println(collection);
	        
	        String string = new String(collection.toString());
	        
	        assertEquals("[one, two, three, four]", string);  
	        assertEquals( 4, collection.size());
	        assertEquals(true, collection.contains("four"));
	        assertEquals(false, collection.isEmpty());
	        
	    }
	 

}
