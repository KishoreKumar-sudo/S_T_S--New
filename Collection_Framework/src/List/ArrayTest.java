package List;

public class ArrayTest {

	public static void main(String[] args) {
		int[] ids= {201,202,203,204};
		
		String[] ename = {"Kishore", "Muniyappan", "Kamesh", "Hariharan"};
		Object[] objs = {205, "Kumar", 300.5f, 450.5};
		
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 4
//		at Collection_Framework/List.ArrayTest.main(ArrayTest.java:10)
//		
//		objs [6] = "Pandi";
		
		System.out.println(ids);
		System.out.println(ename);
		System.out.println(objs);
	}

}
