package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo4 {

	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList <String>();
		al.add("K_K");
		al.add("MN");
		al.add("KK");
		al.add("JK");
		//print the last element
		System.out.println(al.get(al.size()-1));
		
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("K_K");
		ll.add("MN");
		ll.add("KK");
		ll.add("JK");
		//print the last element
		System.out.println(ll.getLast());
		
	}

}
