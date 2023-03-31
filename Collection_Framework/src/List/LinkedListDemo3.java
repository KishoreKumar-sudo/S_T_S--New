package List;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		LinkedList<String> l1= new LinkedList<String>();
		l1.add("Rohit");
		l1.add("Sky");
		l1.add("Bumrah");
		l1.add("Pollard");
		System.out.println(l1);
		l1.addFirst("S_R_T");
		l1.addLast("Hardik");
		System.out.println(l1);
	}

}
