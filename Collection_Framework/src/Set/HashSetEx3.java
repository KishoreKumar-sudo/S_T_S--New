package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx3 {

	public static void main(String[] args) {
		HashSet<Integer>hs1 = new HashSet<Integer>();
		HashSet<Integer>hs2 = new HashSet<Integer>();
		
	
		
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(5);
		hs1.add(6);
		
		hs2.add(7);
		hs2.add(8);
		hs2.add(9);
		hs2.add(10);
		hs2.add(11);
		hs2.add(12);
		System.out.println(hs1);
		System.out.println(hs2);
		
		//Different Types of Sections:
		
		//Union  
		hs1.addAll(hs2);
		System.out.println(hs1);
		
		//Intersection
		hs1.retainAll(hs2);
		System.out.println(hs1);
		
		//Difference
		hs1.removeAll(hs2);
		System.out.println(hs1);
		 }
	

}
