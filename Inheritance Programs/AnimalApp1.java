class Animal1{
	void eat() {
		System.out.println("Animal is eating");

	}
	void sleep() {
		System.out.println("Animal is sleeping");
	}
	void breathe() {
		System.out.println("Animal is breathing");
	}
}
class Tiger1 extends Animal1{
	void eat() {
		System.out.println("Tiger hunts and eat");
	}
	void sleep() {
		System.out.println("tiger is sleeping");
	}
	void breathe() {
		System.out.println("tiger is breathing");
	}
}
class Deer1 extends Animal1{
	void eat() {
		System.out.println("deer graze and eats");
	}
	void sleep() {
		System.out.println("deer is sleeping");
	}
	void breathe() {
		System.out.println("deer is breathing");
	}
}
class Monkey1 extends Animal1{
	void eat() {
		System.out.println("monkey steals and eats");
	}
	void sleep() {
		System.out.println("monkey is sleeping");
	}
	void breathe() {
		System.out.println("Monkey is breathing");
	}
}
class Forest{
	void allowAnimal(Animal1 ref) {
		ref.eat();
		ref.sleep();
		ref.breathe();
	}
}
class AnimalApp1{
	public static void main(String [] args) {
		Tiger1 t=new Tiger1();
		System.out.println();
		Deer1 d=new Deer1();
		System.out.println();
		Monkey1 m=new Monkey1();
		Forest f=new Forest();
		f.allowAnimal(t);
		f.allowAnimal(d);
		f.allowAnimal(m);
		
	}
}