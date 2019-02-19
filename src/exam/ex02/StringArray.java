package exam.ex02;

import java.util.Scanner;

public class StringArray {

	public String[] strs;
	public StringArray() {
		strs = new String[5];
	}
	public static void main(String[] args) {
		StringArray sa = new StringArray();
		System.out.println("5개의 글자를 , 를 기준으로 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println(input);
		
		sa.strs = input.split(",");
		System.out.println("검색할 단어를 입력해주세요.");
		String search = scan.nextLine();
		// sa.strs의 값이 1,2,3 <--3개의 값을 가진 배열이라고 가정
		// search 의 값이 2 라고 가정
		// 아래의 반복문을 돌릴때
		// sa.strs[n] 방이 가지고 있는 값과
		// search가 가지고 있는 값이 같을때만 출력!
		for(int i=0;i<sa.strs.length;i++) {
			if(search.equals(sa.strs[i])) {
				System.out.println("sa.strs[" + i + "]=" + sa.strs[i]);
			}
		}
		scan.close();
		
		
	}
}
