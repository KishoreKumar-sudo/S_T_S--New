package HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMap4 {

	public static void main(String[] args) {
		 HashMap m = new HashMap();
		
		 m.put(201, "Kishore");
		 m.put(202, "Munis");
		 m.put(203, "Kamesh");
		 m.put(204, "Lokesh");
		 
		 Set s= m.keySet();
		 System.out.println(s);
		 
		 //for single line doesn't need this "{}"
		 for(Object o:s) 
			 System.out.println(m.get(o));
	}
}
