class Demos{
	int a,b;
	static int x,y;
	Demos(){
		System.out.println("Demo constructor executed");
	}
	static {
		System.out.println("static block executed");
	}
	{
		System.out.println("non static block executed");
	}
}
	
	class Static2{
		public static void main(String [] args) {
			Demos d1=new Demos();
		}
	}
