package method;

public class Methods3 {

	static int add(int a, int b) {
		return a+b;
	}
	
	static int add() {
		int a = 1;
		return a;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static int add(int a, int b, int c) {
		return (a+b) - c;
	}
	
	public static void main(String[] args) {
		int num1,num2,num3;
		num1 = 10;
		num2 = 20;
		num3 = 30;
		
		System.out.println(add(num1,num2));
		System.out.println(add());
		System.out.println(add(num1,num2,num3));
	}
}
