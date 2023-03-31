package StreamAPI;

import java.util.ArrayList;

public class StreamEx2 {

	public static void main(String[] args) {
		ArrayList<String>enames = new ArrayList<String>();
		enames.add("Rahul");
		enames.add("Sonia");
		enames.add("Rottweiler");
		enames.add("Sunita");
		enames.add("Rajini");
		enames.add("Kamal");
		
		//Using Double Colon Operator(::)
		
//		if we want to filter the data go for filter() 
		enames.stream().filter(ename->ename.startsWith("R"))
//		.forEach(name->System.out.println(name));
		
		.forEach(System.out::println);
		System.out.println("***************");
		
//		if we want to return new object based on each element go for map()
		enames.stream().map(ename->ename.toLowerCase())
		
//		.forEach(name->System.out.println(name));
				.forEach(System.out::println);
		System.out.println("***************");
		
	
		enames.stream().map(ename->ename.toLowerCase())
		.forEach(ename->System.out.println(ename));;
		System.out.println("***************");
		
		enames.stream().filter(ename->ename.startsWith("S"))
		.forEach(name->System.out.println(name));
		System.out.println("***************");
	}
}

