class Plane2{
	void land() {
		System.out.println("plane landed");
	}
}
class Fighter2 extends Plane2{
	void land() {
		System.out.println("Fighter plane Landed");
	}
	void launchMissile() {
		System.out.println("Missile Launched");
	}
}
class TypeCasting{
	public static void main(String [] args) {
		Fighter2 f=new Fighter2();
		Plane2 ref;
		ref=f;
		ref.land();
	//ref.launchMissile();
		((Fighter2)ref).launchMissile();//Alternative way of invoking specialized method
	}
}