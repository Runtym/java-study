package collection.list;

public class Test {

	public static void main(String[] args) {
		String[] values = new String[3];
		values[0] = "str";
		values[1] = "str1";
		values[2] = "str";
		
		
		for(int i=0;i<values.length;i++) {
			if(values[i] == new String("str")) {
				System.out.println(i);
			}
		}
	}
}
