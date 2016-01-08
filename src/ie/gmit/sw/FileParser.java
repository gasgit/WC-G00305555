package ie.gmit.sw;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FileParser implements Strategy{
	
	private static final int CHAR_MIN = 65;
	private static final int CHAR_MAX = 122;
	
	
	public Collection<String> parseFile(String file) throws IOException{
		
		Collection<String> myCol = new ArrayList<>();
		
		String line = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		
		while((line = br.readLine()) != null){
			String [] words = line.split("\\s+");
			for (int i = 0; i < words.length; i++) {
				String nxtWord = process(words[i]);
				if(nxtWord != null){
					myCol.add(nxtWord);
				}
				
			}
			
		}
		br.close();
		
		
		return myCol;
		
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

	@Override
	public List<String> parseHTML(String address) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
