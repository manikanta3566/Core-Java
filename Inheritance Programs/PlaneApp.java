class Plane{
	void takeOff() {
		System.out.println("Plane tookoff");
	}
	void fly() {
		System.out.println("Plane is flying");
	}
	void land() {
		System.out.println("Plane is landing");
	}
}
class Cargo extends Plane{
	void carryCargo() {
		System.out.println("plane carrying cargo");
	}
}
class Passenger extends Plane{
	void carryPassenger() {
		System.out.println("plane carrying passenger");
	}
}
class Fighter extends Plane{
	void carryWeapons() {
		System.out.println("plane carrying weapons");
	}
}
class PlaneApp{
	public static void main(String [] args) {
		Cargo c=new Cargo();
		Passenger p=new Passenger();
		Fighter f=new Fighter();
		c.takeOff();
		c.fly();
		c.carryCargo();
		c.land();
		p.takeOff();
		p.fly();
		p.carryPassenger();
		p.land();
		f.takeOff();
		f.fly();
		f.carryWeapons();
		f.land();
	}
}