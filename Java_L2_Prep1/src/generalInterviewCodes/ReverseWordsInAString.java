package generalInterviewCodes;

public class ReverseWordsInAString {
	
	    public static void main(String[] args) {
	    	
	        String s = "Hello world java program";
	        
	        String[] words = s.split(" ");
	        
	        StringBuffer sb = new StringBuffer();
	        
	        for(int i=words.length-1; i>=0; i--)
	        {
	        	sb.append(words[i]).append(" ");
	        }
	        
	        
	        System.out.println(sb.toString().trim());
	        		
	        
	    }
	}


