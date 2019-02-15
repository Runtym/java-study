package oop.inherit;

class GrandFather{
	GrandFather(){
		
	}
	void work() {
		System.out.println("할아버지가 농사를 짓습니다.");
	}
}

class Father extends GrandFather{
	Father(){
		
	}
	void work() {
		System.out.println("아빠가 일함.");
	}
}
public class Son extends Father{
	Son(){
		this.work();
		super.work();
	}
	void work() {
		System.out.println("아들이 공부함.");
	}
	
	public static void main(String[] args) {
		Son s = new Son();
	}
}
