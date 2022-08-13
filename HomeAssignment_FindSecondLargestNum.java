package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HomeAssignment_FindSecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Here is the input
				int[] data = {3,2,11,4,6,7};
				
				List<Integer> list1 = new ArrayList<Integer>();
				
				for(int i=0; i<data.length; i++) {
					list1.add(data[i]);
				}
				

				Set<Integer> set = new TreeSet<Integer>();
				
				set.addAll(list1);
				
				List<Integer> list2 = new ArrayList<Integer>();
				list2.addAll(set);
				
				System.out.println("The second largest number is: " + list2.get(list2.size()-2));

	}

}
