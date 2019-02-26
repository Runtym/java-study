package collection.list;

import java.util.ArrayList;
import java.util.List;

class Person{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
public class PersonList {
	public static void main(String[] args) {
		List<Person> pList = new ArrayList<>();
		// 반복문을 사용해서
		// 총 10개의 Person을 생성한뒤
		// pList에 add 하면 됩니다.
		// 각 Person의 이름은 이름1~이름10 입니다.
		
		for(int i=0;i<10;i++) {
			Person p = new Person();
			pList.add(new Person());
			p.setName("이름" + (i+1));
		}
		for(int i=0;i<10;i++) {
			Person p = pList.get(i);
			System.out.println(p.getName());
		}
		
	}
}
