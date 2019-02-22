package syntax;

public class ClassExam10 {
	int a = 1;
	char c = '1';
	String s = "1";
	
	void test() {
		System.out.println("난 ClassExam꺼!");
	}
	
	public static void main(String[] args) {
		int a = 1;
		ClassExam10 ce = new ClassExam10();
		ce.a = 3;
		ce = new ClassExam10();
		System.out.println(ce.a);
		
	}
}
