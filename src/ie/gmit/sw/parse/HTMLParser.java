package ie.gmit.sw.parse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

	/**
	 * Class to parse html page and return collection of words
	 * 
	 * @author glen
	 *  
	 *
	 */

public class HTMLParser implements StrategyParse {
	
	private static final int CHAR_MIN = 65;
	private static final int CHAR_MAX = 122;
	/**
	 * Method passed url as string<br/>
	 * Collection created to store words<br/>
	 * Uses jsoup to connect to the url and get document<br/>
	 * Uses jsuop to parse document to string<br/>
	 * Split string into words array<br/>
	 * Loop words array remove non words and add to collection
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
	 * Method to process string<br/>
	 * Drop to lower case<br/>
	 * Check if char is a letter<br/>
	 * Append to string builder and return<br/>
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
