package List;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> l1= new LinkedList<String>();
		l1.add("Kishore");
		l1.add("Munis");
		l1.add("Kamesh");
		l1.add("Jai");
		
		System.out.println(l1); 	
		System.out.println(l1.size());
		
		for(String ename:l1) {
			System.out.println(ename);
		}
	}

}
