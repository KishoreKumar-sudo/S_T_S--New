package StreamAPI;

import java.util.ArrayList;

public class StreamEx {

	public static void main(String[] args) {
		ArrayList<Integer>al = new ArrayList<Integer>();
		for(int i=0; i<=10; i++) {
			al.add(i);
		}
		System.out.println(al);
//		creation of Stream Object
		al.stream()
		.filter((ele)->{return ele%2 ==0;});
		al.forEach((list)->{System.out.println(list);});
	}

}