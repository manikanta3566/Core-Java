class Demos1{
	int a,b;
	static int x,y;
	Demos1(){
		System.out.println("Demo constructor executed");
	}
	static {
		System.out.println("static block executed");
	}
	{
		System.out.println("non static block executed");
	}
	void nonstaticDisp() {
		System.out.println("non static disp executed");
	}
	static void staticDisp() {
		System.out.println("static disp executed");
	}
}
	
	class Static3{
		public static void main(String [] args) {
			Demos1 d1=new Demos1();
			d1.staticDisp();
			d1.nonstaticDisp();
		}
	}
