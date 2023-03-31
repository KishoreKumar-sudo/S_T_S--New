class Test {
    public static void main(String[] args) {
        int[] ids = { 001, 002, 003, 004, 005 };

        String[] enames = { "Kishore", "Muniyappan", "Kamesh", "Hariharan" };
        Object[] objs = { 001, "Kumar", 400.5, 150.4f };

       // objs[10]= "Dhayanidhi"; ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 4

        System.out.println(ids);
        System.out.println(enames);
        System.out.println(objs);
    }
}