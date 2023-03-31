package HashMap;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		 HashMap m = new HashMap();
		 System.out.println(m);
		 m.put(201, "Kishore");
		 m.put(202, "Munis");
		 m.put(203, "Kamesh");
		 System.out.println(m);
		 System.out.println(m.get(203));
		 System.out.println(m.keySet());
		 System.out.println(m.values());
		 System.out.println(m.containsKey(203));
		 System.out.println(m.containsValue("Imad"));
	}

}
