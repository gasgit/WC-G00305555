package ie.gmit.sw.jtest;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.junit.Test;

import ie.gmit.sw.parse.FileParser;
import ie.gmit.sw.sort.FrequencyCounter;

public class TestFrequencyCounter {

	@Test
	public void testFrequencyCounter() throws IOException {
		
		
		FrequencyCounter tfq = new FrequencyCounter();
		FileParser tfp = new FileParser();
		
		
		
		Collection<String> coll = tfp.parseFile("testIgnoreWordsFile.txt");
		Map<String, Integer> testMap = tfq.frequencyCounter(coll);
		System.out.println("Map size: " + testMap.size());
		System.out.println("TestMap: " + testMap);
		
		assertEquals(56, testMap.size());
		assertEquals(9, Collections.max(testMap.values()));
	}
	

}
