package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		 HashSet<Integer> hs = new HashSet<Integer>(50,0.9f);
		 hs.add(20);
		 hs.add(25);
		 hs.add(30);
		 hs.add(35);
		 System.out.println(hs);
		 System.out.println(hs.size());
		 System.out.println(hs.isEmpty());
		 
		 /*for(Object obj:hs) {
			 System.out.println(obj);
		 }*/
		
		 Iterator i = hs.iterator();
		 while(i.hasNext()) {
			 System.out.println(i.next());
		 }
	}

}
