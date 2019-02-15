package method;

public class Methods2 {
	static void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Methods2.add(1,0);
		int a = 1;
		Methods2.add(a,3);
		int b = 10;
		Methods2.add(a,b);
	}
}
