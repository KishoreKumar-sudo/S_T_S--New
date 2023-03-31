package LambdaExpression;

interface Interface1{
	void display();
}

public class Ex1 {

	public static void main(String[] args) {
		Interface1 i=()->{System.out.println("Hello");};
		i.display();
	}

}
