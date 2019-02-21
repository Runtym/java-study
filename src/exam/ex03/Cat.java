package exam.ex03;

public class Cat {
	public String name;
	public int age;
	
	public String toString() {
		return "이 고양이의 이름은 " + name + "이구요, 나이는 " + age
				+ "입니다.";
	}
	public static void main(String[] args) {
		Cat[] cats = new Cat[3];
		for(int i=0;i<cats.length;i++) {
			cats[i] = new Cat();
			cats[i].name = "이름" + (i+1);
			cats[i].age = i;
		}
		for(int i=0;i<cats.length;i++) {
			System.out.println(cats[i].name);
			System.out.println(cats[i].age);
			System.out.println(cats[i]);
		}
	}
}
