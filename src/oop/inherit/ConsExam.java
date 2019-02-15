package oop.inherit;

class Book{
	String name;
	int year;
	Book(){
		this("자바의 정석");
	}
	Book(String name){
		this(name, 2019);
	}
	Book(String name, int year){
		this.name = "책 제목 : " + name;
		this.year = year;
	}
}

public class ConsExam extends Book {
	ConsExam(){
		super();
	}
	public static void main(String[] args) {
		ConsExam ce = new ConsExam();
		System.out.println(ce.name);
		Book b = new Book("자바의 정석 2nd",2015);
	}
}
