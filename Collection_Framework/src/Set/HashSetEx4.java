package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx4 {

	public static void main(String[] args) {
		HashSet<Integer> num = new HashSet<Integer>();
		//default capacity - 16 
		//load factor / fill ration: 0.75f
		num.add(2);
		num.add(4);
		num.add(6);
		num.add(8);
		num.add(10);
		
		HashSet<Integer> odd_num = new HashSet<Integer>();
		odd_num.add(1);
		odd_num.add(3);
		odd_num.add(5);
		odd_num.add(7);
		odd_num.add(9);
		
		num.addAll(odd_num);
		System.out.println(num);
		odd_num.retainAll(num);
		System.out.println(odd_num);

	}

}
