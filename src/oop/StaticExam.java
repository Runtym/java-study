package oop;

public class StaticExam {
	static int num = 1;
	
	public static void main(String[] args) {
		StaticExam se = new StaticExam();
		System.out.println(se.num);
		se.num = 10;
		se = new StaticExam();
		System.out.println(se.num);
		System.out.println(StaticExam.num);
	}
}
