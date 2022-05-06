package entidade;

import java.util.ArrayList;
import java.util.List;

public class palavrasProibidas {
	
	public boolean procurarpalavraproibida (String post) {
		post.toLowerCase();
		List<String> listaPalavrasProibidas = new ArrayList<>();
		listaPalavrasProibidas.add("mongol");
		listaPalavrasProibidas.add("merda");
		
		for(String tmpList : listaPalavrasProibidas) {
			char char1 [] = new char [post.length()];
	        char char2 [] = new char [tmpList.length()];
	        
	        for(int i = 0; i < post.length(); i++){
	            char1[i] = post.charAt(i);
	        }

	        for(int i = 0; i < tmpList.length(); i++){
	            char2[i] = tmpList.charAt(i);
	        }

	        for(int i = 0; i < char1.length; i++){
	            if(char2[0] == char1[i]){
	                for(int j = 1; j < char2.length; j++){
	                    if(char1[i+j] == char2[j]){
	                        if(j == char2.length-1){
	                        	System.out.println("MATCH");
	                            return true;
	                        }
	                    }else{
	                        break;
	                    }
	                }
	            }
	            
	        }
		}
		return false;
	}
}
