package generalInterviewCodes;

import java.util.HashSet;

public class RemoveDuplicatesFromArray {
	
	public static void main(String[] args) 
	{
        int[] arr = {4, 2, 1, 3, 2, 4, 5, 6, 1};
        removeDuplicates(arr);
        
    }
        
    public static void removeDuplicates(int[] a)
    {
    	HashSet<Integer> set = new HashSet<Integer>();
    	
    	for(int i : a)
    	{
    		if(set.add(i) == true)
    		{
    			System.out.print(i);
    		}
    		
    		
    	}
    }

}
