//Strings created using literal fashion & new operator

class Demo{
    public static void main(String[] args){
        String s1 = "Kishore";
        s1.concat("Kumar");

        StringBuffer s2 = new StringBuffer("Santhosh");
        s2.append("Kumar");
        System.out.println(s1);//Kishore
        System.out.println(s2);//SanthoshKumar
        System.out.println(s2.length());//13
    }
}