package exam.ex01;

public class StringEquals2 {
	String str = "1";
	public static void main(String[] args) {
		StringEquals2 se1 = new StringEquals2();
		System.out.println(se1.str);
		Test t = new Test();
		System.out.println(se1.str==t.str);
	}
}
