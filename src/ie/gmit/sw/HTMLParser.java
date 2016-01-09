package ie.gmit.sw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HTMLParser implements StrategyParse {
	
	private static final int CHAR_MIN = 65;
	private static final int CHAR_MAX = 122;

	
	public Collection<String> parseHTML(String address) throws IOException{
		
		Collection<String> hCol = new ArrayList<>();
		
		Document doc = Jsoup.connect(address).get();  
		
		String str = Jsoup.parse(doc.toString()).text();
		
		String[] words = str.split("\\s+");
		
		
		for (int i = 0; i < words.length; i++) {
		   			
			words[i] = words[i].replaceAll("[^\\w]", "")
								.replaceAll("[^\\D]", "");
							
			String nxtWord = process(words[i]);
			if(nxtWord != null){
				hCol.add(nxtWord);
			}
					
		}
		
	 return hCol;  

}  
	private String process(String s){
		String word = s.trim().toLowerCase();
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<word.length();i++){
			if((word.charAt(i)>=CHAR_MIN && word.charAt(i)<= CHAR_MAX )
					||( word.charAt(i)>=48 && word.charAt(i)<=57)){
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
