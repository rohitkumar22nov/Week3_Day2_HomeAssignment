package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class HomeAssignment_FindInsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		INCOMPLETE.......
		
		 int array1 [] = {3,2,11,4,6,7};	 
		 int array2 [] = {1,2,8,4,9,7};
		 int array3 []= new int[10];
		 
		 List<Integer> list1 = new ArrayList<Integer>();
		 List<Integer> list2 = new ArrayList<Integer>();
		 List<Integer> list3 = new ArrayList<Integer>();
		 
		 for(int i=0; i<array1.length; i++) {
		 
			 list1.add(array1[i]);

			 list2.add(array2[i]);

			 }
		 
		 for(int i=0; i<list1.size(); i++) {
			 
			 for(int j=0; j<list1.size(); j++) {
				 
				 if(list1.get(i) == list2.get(j)) {
					 
					 list3.add(list1.get(i));
				 }
			 }
		 }
		 
		 for(int i=0; i<list3.size(); i++) {
			 System.out.println(list3.get(i));
		 }
			 
	}

}
