class Animal{
	void eat() {
		System.out.println("Animal is eating");
	}
	void sleep()
	{
		System.out.println("Animal is sleeping");
	}
	void breath() {
		System.out.println("Animal is breathing");
	}
}
class Tiger extends Animal{
	void eat() {
		System.out.println("Tiger hunts and eats");
	}
}
class Deer extends Animal{
	void eat() {
		System.out.println("Deer grace and eats");
	}
}
class Monkey extends Animal{
	void eat() {
		System.out.println("Monkey steals and eats");
	}
}
class AnimalApp{
	public static void main(String [] ars) {
		Tiger t=new Tiger();
		Deer d=new Deer();
		Monkey m=new Monkey();
		t.eat();
		t.sleep();
		t.breath();
		d.eat();
		d.sleep();
		d.breath();
		m.eat();
		m.sleep();
		m.breath();
	}
}