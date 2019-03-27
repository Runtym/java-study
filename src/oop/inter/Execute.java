package oop.inter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Execute {
	static void doWork(Work d) {
		d.goOffice();
		d.working();
		d.eat();
		d.goHome();
	}
	static List<String> addList(List<String> list) {
		list.add("abc");
		System.out.println(list);
		return list;
	}
	public static void main(String[] args) {
		Developer d = new Developer();
		Manager m = new Manager();
		doWork(d);
		doWork(m);
		ArrayList<String> aList = new ArrayList<>();
		LinkedList<String> lList = new LinkedList<>();
		addList(aList);
		addList(lList);
		
	}
}
