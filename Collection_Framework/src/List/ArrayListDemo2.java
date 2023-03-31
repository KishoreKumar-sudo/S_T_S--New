package List;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<String> al2 = new ArrayList<String>();
		ArrayList al3 = new ArrayList();
		al1.add(12);
		al1.add(16);
		al1.add(20);
		al2.add("KK");
		al2.add("MI");
		al2.add("KP");
//		System.out.println(al1);
//		System.out.println(al1.get(0));
//		System.out.println(al1.get(1));
//		System.out.println(al1.get(2));
		//System.out.println(al1.get(10));
		System.out.println(al2);
		System.out.println(al2.get(0));
		System.out.println(al2.get(1));
		System.out.println(al2.get(2));
		System.out.println(al2.set(2, "Mohammed Imad"));
	}
}
