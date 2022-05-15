class Plane1{
	void land()
	{
		System.out.println("plane is landing");
	}
}
class Cargo1 extends Plane1{
	void land() {
		System.out.println("cargo plane landed");

	}
}
class Fighter1 extends Plane1{
	void land() {
		System.out.println("Fighter plane  landed");

	}
}
class Passenger1 extends Plane1{
	void land() {
		System.out.println("Passenger plane landed");

	}
}
class Airport{
	void allowLand(Plane1 ref) {
		ref.land();
	}
}
class PlaneApp1{
	public static void main(String [] args) {
		Cargo1 c=new Cargo1();
		Fighter1 f=new Fighter1();
		Passenger1 p=new Passenger1();
		Airport a=new Airport();
		a.allowLand(c);
		a.allowLand(f);
		a.allowLand(p);
	}
}