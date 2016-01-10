package ie.gmit.sw.parse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

	/**
	 * 
	 * @author glen
	 *  class to parse html page and return collection of words
	 *
	 */

public class HTMLParser implements StrategyParse {
	
	private static final int CHAR_MIN = 65;
	private static final int CHAR_MAX = 122;
	/**
	 * method passed url as string
	 * collection created to store words
	 * uses jsoup to connect to the url and get document
	 * uses jsuop to parse document to string
	 * split strin int words  array
	 * loop wordsa array remove non words and add to collection
	 */
	
	public Collection<String> parseHTML(String address) throws IOException{
		
		Collection<String> hCol = new ArrayList<>();
		
		Document doc = null;
		try {
			doc = Jsoup.connect(address).get();
		} catch (Exception e) {
			
			System.out.println("Invalid Url, please check!!");
		}  
		
		String str = Jsoup.parse(doc.toString()).text();
		
		String[] words = str.split("\\s+");
		
		
		for (int i = 0; i < words.length; i++) {
		   			
		words[i] = words[i].replaceAll("[^\\w]", "");
								
							
			String nxtWord = process(words[i]);
			if(nxtWord != null){
				hCol.add(nxtWord);
			}
			hCol.remove("");
					
		}
		
	 return hCol;  

}  
	
	/**
	 * method to process string
	 * drop to lower case
	 * check if char is a letter 
	 * append to string builder and return
	 * 
	 * @param s
	 * @return
	 */
	private String process(String s){
		String word = s.trim().toLowerCase();
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<word.length();i++){
			if((word.charAt(i)>=CHAR_MIN && word.charAt(i)<= 90 )
					||( word.charAt(i)>=97 && word.charAt(i)<=CHAR_MAX)){
					

				sb.append(word.charAt(i));
			}
			else{
				break;
			}
		}
		return sb.toString();
}


	public Collection<String> parseFile(String file) throws IOException {
		return null;
	}  
	

}
