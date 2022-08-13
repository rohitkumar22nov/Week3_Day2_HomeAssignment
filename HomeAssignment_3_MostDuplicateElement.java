package week3.day2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HomeAssignment_3_MostDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Psuedocode
		 * 
		 * 1) Map -> HashMap 
		 * 2) String -> ch[] -> Get all the character -> occurance
		 * 3) Keep comparing the occurance with other values -> max value -> character
		 * 
		 */
		
    char output = mostDuplicateChar("aabbccc");
	System.out.println(output);
    
	}	
	
	
	public static char mostDuplicateChar(String str) {
		
        char output = 0 ;

		
		Map<Character, Integer> map = new HashMap<Character, Integer>();


		
		System.out.println(str);
		for(int i=0; i<str.length(); i++) {
			
			if(map.containsKey(str.charAt(i))) {
				
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				
				map.put(str.charAt(i), 1);
			}
		}
		
		Map.Entry<Character, Integer> maxEntry = null;
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			
			if(maxEntry==null || entry.getValue().compareTo(maxEntry.getValue())>0) {
				
				maxEntry = entry;
				output = entry.getKey();
			}
		}
		
         return output;
		
		
	}
	
	
	
	
	
	
	
	
	

}
