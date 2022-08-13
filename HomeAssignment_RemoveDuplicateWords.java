package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HomeAssignment_RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		String [] arrayStr = text.split(" ");
		
		String noDupe ="";
		
		Set<String> set = new LinkedHashSet<String>(); // using LinkedHashSet to preserve the insertion order
		List<String> list = new ArrayList<String>();
	
		for(int i=0; i<arrayStr.length; i++) {
			
			list.add(arrayStr[i]);
			set.addAll(list);
			noDupe = set.toString();	
			
		}

		System.out.println(set.toString());
		System.out.println(noDupe);
	}

}
