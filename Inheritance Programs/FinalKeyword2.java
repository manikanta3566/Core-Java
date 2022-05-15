class Plane4{
	void land() {
		System.out.println("plane landed");
	}
}
final class Fighter4 extends Plane4{//Final keyword is used to prevent inheritance
	void land() {
		System.out.println("plane landed at 300km/hr");
	}
}
	//class Supersonic1 extends Fighter4{
 // final void land() {////final keyword is used to prevent the overiding the method
	 // System.out.println("plane landed at 400km/hr"); 
	//}
	//}
	
	class FinalKeyword2{
		public static void main(String [] args) {
			Fighter4 f=new Fighter4();
			//Supersonic1 s=new Supersonic1();
			f.land();
			//s.land();
		}
	}
		
	