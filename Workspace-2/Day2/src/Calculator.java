public class Calculator {
	public int sum(int a, int b) {

		int c = a + b;

		return c;
	}

	public int subtract(int a, int b) {

		int c = a - b;

		return c;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator s1 = new Calculator();
		int add = s1.sum(15, 10);

		int subtract = s1.subtract(16, 12);
		System.out.println(add);
		System.out.println(subtract);

	}

}
