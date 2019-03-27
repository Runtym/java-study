package oop.inherit;

public class Mother {
	public Mother() {}
	public Mother(String str)
	{
		System.out.println("엄마");
	}
	protected int money = 100;
	
	protected int getMoney() {
		return money;
	}
}
