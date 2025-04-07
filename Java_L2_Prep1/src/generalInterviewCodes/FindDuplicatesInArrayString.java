package generalInterviewCodes;

import java.util.*;
import java.util.Arrays; 

public class FindDuplicatesInArrayString {	
	    
	    public static void findDuplicates(int[] array) { 
	    	
	        Arrays.sort(array); // Sorting the array  
	        
	        //The Arrays.sort method sorts the input array in ascending order. After sorting, all duplicate elements will be grouped together.
	        //int[] array = {4, 4, 5, 5, 6, 7, 9};    after sorting
	        
	        for (int i = 0; i < array.length - 1 ; i++) 
	        {  
	            if (array[i] == array[i + 1]) 
	            {  
	                System.out.println("Duplicate element found: " + array[i]);  
	            }  
	        }  
	    }  
	    
	    public static void main(String[] args) 
	    {  
	        int[] array = {4, 5, 6, 7, 4, 9, 5};  
	        findDuplicates(array);  
	    }  
	

		

	}


