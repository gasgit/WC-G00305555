package ie.gmit.sw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HTMLParser implements Strategy {
	
	private List<String> ls = new ArrayList<String>();

	
	public List<String> parseHTML(String address) throws IOException{
		
      
		Document doc = Jsoup.connect(address).get();  
		
		String str = Jsoup.parse(doc.toString()).text();
		
		String[] words = str.split("\\s+");
		for (int i = 0; i < words.length; i++) {
		   
		    words[i] = words[i].replaceAll("[^\\w]", "");
		}
		
		
		for(String wrd : words){
			ls.add(wrd);
		}



	 return ls;  

}


	@Override
	public Collection<String> parseFile(String file) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}  
	

}
