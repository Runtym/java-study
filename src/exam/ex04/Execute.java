package exam.ex04;

public class Execute {

	public static void space(Action p) {
		p.sleep();
		p.eat("고등어");
	}
	public static void main(String[] args) {
		Action c = new Cat();
		Action p = new Person();
		
		space(c);
		space(p);
	}
}
