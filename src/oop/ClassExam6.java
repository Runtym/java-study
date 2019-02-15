package oop;

import java.util.Scanner;

public class ClassExam6 {
	int[] nums;
	ClassExam6(int size){
		nums = new int[size];
	}
	public static void main(String[] args) {
		System.out.println("원하시는 방갯수를 입력해주세요!");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		ClassExam6 ce = new ClassExam6(size);
		System.out.println("size of ce's num = " + ce.nums.length);
	}
}
