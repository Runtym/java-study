package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

interface Test{
	void a();
	void b();
}
class Test1 implements Test{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}
	
}
public class ListExam3 {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		List<String> ll = new LinkedList<>();
		List<String> v = new Vector<>();
		System.out.println(al);
		System.out.println(ll);
		System.out.println(v);
		al.add("1");
		ll.add("1");
		v.add("1");
		System.out.println(al);
		System.out.println(ll);
		System.out.println(v);
	}
}
