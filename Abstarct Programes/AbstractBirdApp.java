abstract class bird{
	abstract void fly();
	abstract void eat();
}
class sparrow extends bird{
	void fly() {
		System.out.println("sparrow fly fast");
	}
	void eat() {
		System.out.println("sparrow eats insects");
	}
}
abstract class eagle extends bird{
	void fly() {
		System.out.println("all eagles fly very high ");
	}
	abstract void eat();
}
class crow extends bird{
	void fly() {
		System.out.println("crow fly at medium height");
	}
	void eat() {
		System.out.println("crow eats flashes");
	}
}
class serpent extends eagle{
	void eat() {
		System.out.println("serpent eagle eats snakes");
	}
}
class golden extends eagle{
	void eat() {
		System.out.println("golden eagle hunts over the occean");
	}
}
class sky{
	void allowbird(bird ref) {
		ref.fly();
		ref.eat();
	}
}
class AbstractBirdApp{
	public static void main(String [] args) {
		sparrow s=new sparrow();
		serpent se=new serpent();
		golden g=new golden();
		crow c=new crow();
		sky s1=new sky();
		s1.allowbird(s);
		System.out.println();
		s1.allowbird(se);
		System.out.println();
		s1.allowbird(g);
		System.out.println();
		s1.allowbird(c);
	}
}