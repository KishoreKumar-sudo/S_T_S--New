package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx2 {

	public static void main(String[] args) {
		 HashSet hs = new HashSet();
		 hs.add(10);
		 
		 //duplicates are not allowed
		 hs.add(10);
		 hs.add(10);
		 hs.add(10);
		 hs.add(10);
		 hs.add(20);
		 hs.add("Kishore");
		 hs.add(300.5);
		 hs.add(null);
		 
		 //insertion order is not preserved
		 System.out.println(hs);
		 
		 for(Object obj: hs) {
			 System.out.println(obj);
		 }
		 }
	

}
