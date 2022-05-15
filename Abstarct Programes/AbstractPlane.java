abstract class plane {
	abstract void takeoff();
	abstract void fly();
	abstract void land();
}
class cargo extends plane{
	void takeoff() {
		System.out.println("cargo plane tookoff");
	}
	void fly() {
		System.out.println("cargo plane is flying");
	}
	void land() {
		System.out.println("cargo plane landed");
	}
}
class passenger extends plane{
	void takeoff() {
		System.out.println("passenger plane tookoff");
	}
	void fly() {
		System.out.println("passenger plane is flying");
	}
	void land() {
		System.out.println("passenger plane landed");
	}
	
}
class fighter extends plane{
	void takeoff() {
		System.out.println("fighter plane tookoff");
	}
	void fly() {
		System.out.println("fighter plane is flying");
	}
	void land() {
		System.out.println("fighter plane landed");
	}
}
class airport{
	void allowplane(plane ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
	}
}
class AbstractPlane{
	public static void main(String [] args) {
		cargo c=new cargo();
		passenger p=new passenger();
		fighter f=new fighter();
		airport a=new airport();
		a.allowplane(c);
		System.out.println();
		a.allowplane(p);
		System.out.println();
		a.allowplane(f);
		
	}
}