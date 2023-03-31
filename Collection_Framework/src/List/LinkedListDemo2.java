package List;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList<String> l1= new LinkedList<String>();
		l1.add("Munis");
		l1.add("Kishore");
		l1.add("Jai");
		l1.add("Kamesh");
		LinkedList<String> l2 = new LinkedList<String>();
//		l2.add(null);
		l2.add("Chaitanya");
		l2.add("Imad");
		l2.add("Pandi");
		System.out.println(l1);
		System.out.println(l2);
		Collections.sort(l1);
		System.out.println(l1);
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println(l1);
		Collections.sort(l2);
		System.out.println(l2);
		Collections.sort(l2,Collections.reverseOrder());
		System.out.println(l2);
	}

}
