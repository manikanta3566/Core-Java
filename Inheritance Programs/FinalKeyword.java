class Plane3{
	void land() {
		System.out.println("plane landed");
	}
}
class Fighter3 extends Plane3{
	void land() {
		System.out.println("plane landed at 300km/hr");
	}
}
	class Supersonic extends Fighter3{
  final void land() {////final keyword is used to prevent the overiding the method
	  System.out.println("plane landed at 400km/hr"); 
	}
	}
	class Passenger3 extends Supersonic{
		//void land() {
			//System.out.println("plane landed at 300km/hr");
		}
	//}
	class FinalKeyword{
		public static void main(String [] args) {
			Fighter3 f=new Fighter3();
			Supersonic s=new Supersonic();
			f.land();
			s.land();
		}
	}
	
	
