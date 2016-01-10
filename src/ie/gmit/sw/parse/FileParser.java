package ie.gmit.sw.parse;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
	/**
	 * 
	 * @author glen
	 *  class fto parse file and return collection of words
	 */


public class FileParser implements StrategyParse{
	
	private static final int CHAR_MIN = 65;
	private static final int CHAR_MAX = 122;
	
	/**
	 * method is passed file name
	 * collection created as array list to store words
	 * 
	 * 
	 */
	
	
	public Collection<String> parseFile(String file) throws IOException{
		
		Collection<String> myCol = new ArrayList<>();
		
		String line = null;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		} catch (Exception e) {
			
			System.out.println("File does not exist, check path!!");
		}
		
		while((line = br.readLine()) != null){
			String [] words = line.split("\\s+");
			for (int i = 0; i < words.length; i++) {
				String nxtWord = process(words[i]);
				
				
				
				if(nxtWord != null){
					myCol.add(nxtWord);
				}
				
				myCol.remove("");		

				
			}		
			
		}
		br.close();	
		return myCol;
		
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
			if((word.charAt(i)>=CHAR_MIN && word.charAt(i)<= CHAR_MAX )){

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
