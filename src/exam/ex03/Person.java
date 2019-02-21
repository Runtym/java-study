package exam.ex03;

public class Person {
	public String name;
	public int age;
	public static void main(String[] args) {
		
		Person[] p = new Person[3];
		for(int i=0;i<p.length;i++) {
			p[i].name = "이름" + 1;
			p[i].age = 1;
		}
		
		//아래의 출력값은 
		// p[0].name => 이름0
		// p[0].age = > 0
		for(int i=0;i<p.length;i++) {
			
		}
		
	}
}
