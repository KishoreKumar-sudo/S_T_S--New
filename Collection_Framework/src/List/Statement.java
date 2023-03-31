package List;

import java.util.ArrayList;
import java.util.Arrays;

public class Statement {

	public static void main(String[] args) {
	String s = "Hello, Welcome to Greet_Labs";
	String[] words = s.split(" ");
	
	ArrayList<String> al = new ArrayList<String>(Arrays.asList(words));
	for(String word: words) {
		System.out.println(word);
	}
	System.out.println(s.split(" ")); //leads to hashcode
	System.out.println(s.split(" ").length);

	
	}

}
