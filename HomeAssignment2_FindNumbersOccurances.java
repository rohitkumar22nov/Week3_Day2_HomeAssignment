package week3.day2;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class HomeAssignment2_FindNumbersOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Input array numbers, each occurances
		 * 
		 * input: {2,3,5,6,3,2,1,4,2,1,6,-1};
		 * output: 2 -> 3 , 3 -> 2, 4 -> 1 
		 * 
		 * Order: Ascending Order
		 * 
		 */
		
		/*
		 * Psuedcode:
		 * 
		 * 1) Create Map -> TreeMap
		 * 2) For loop -> each number -> add to the map
		 * 3) If it is exist -> update it with + 1
		 * 	  Else -> new entry with 1 as value
		 * 
		 */
	
		int num [] =  {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		map = findNumbersOccurances(num);
		System.out.println(map);

	}
	
	
	public static Map findNumbersOccurances(int [] num) {
		
		
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		for(int i=0; i<num.length; i++) {
			
			if(map.containsKey(num[i])){
				map.put(num[i],  map.get(num[i])+1);
			}
			else
			{
				map.put(num[i], 1);
			}
		}
		
		return map;
		
	}
	
	
	
	
	
	
	

}
