package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap2 {

	public static void main(String[] args) {
		 HashMap m = new HashMap();
		
		 m.put(201, "Kishore");
		 m.put(202, "Munis");
		 m.put(203, "Kamesh");
		 m.put(204, "Lokesh");
		 
		 System.out.println(m);
		 
		 for(Object o:m.keySet()) {
		System.out.println(o);
		 }
		 
		 System.out.println("*****");
		 
		 for(Object o:m.values()) {
			 System.out.println(o);
		 }
		 System.out.println("*****");
		 
		 for(Object o:m.entrySet()) {
			 System.out.println(o);
	}
		 Iterator i = m.entrySet().iterator();
				 while(i.hasNext()) {
					Map.Entry x =(Entry)i.next();
					System.out.println(x.getKey() + ":" + x.getValue());
				 }
}
}
