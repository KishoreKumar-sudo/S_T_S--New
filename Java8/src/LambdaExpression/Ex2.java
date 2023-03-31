package LambdaExpression;

interface Interface2{
	void display();
}

public class Ex2 {

	public static void main(String[] args) {
		Interface1 i=()->{System.out.println("Hello");};
		i.display();
	}

}
