class Demos6{
	int a,b;
	static int x,y;
	static {
		x=10;
		y=20;
	}
	{
		x=300;
		y=400;
	}
	void nonstaticDisp() {
		System.out.println(x);
		System.out.println(y);
		}
	static void staticDisp() {
		System.out.println(x);
		System.out.println(y);
	}
}
class Static6Rules{
	public static void main(String [] args) {
		Demos6 d1=new Demos6();
		d1.nonstaticDisp();
		d1.staticDisp();
		
	}
}