package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap3 {

	public static void main(String[] args) {
		 HashMap m = new HashMap();
		
		 m.put(201, "Kishore");
		 m.put(202, "Munis");
		 m.put(203, "Kamesh");
		 m.put(204, "Lokesh");
		 
		 System.out.println(m.entrySet());
		 System.out.println(m.keySet());
		 System.out.println(m);
		 System.out.println(m.values());
}
}
