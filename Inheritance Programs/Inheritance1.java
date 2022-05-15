class A{
	int i;
	A(){
		
	System.out.println("A constructor");
}
}
class B extends A{
	int j;
	B(){
		System.out.println("B constructor ");
	}
}
	class C extends B{
		C(){
			System.out.println("c constructor ");
		}
	}
	class Inheritance1{
		public static void main(String [] args) {
			C c1=new C();
		}
	}
