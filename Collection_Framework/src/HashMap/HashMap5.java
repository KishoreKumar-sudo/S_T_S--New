package HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMap5 {

	public static void main(String[] args) {
		 HashMap m = new HashMap();
		
		 m.put(201, "Kishore");
		 m.put(202, "Munis");
		 m.put(203, "Kamesh");
		 m.put(204, "Lokesh");
		 
		 m.remove(204);
		 System.out.println(m);
	}
}
