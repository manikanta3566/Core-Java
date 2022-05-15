class Demos7{
	int a,b;
	static int x,y;
	static {
		//a=10;
		//b=20;
	}
	{
		a=30;
		b=40;
	}
	void nonstaticDisp() {
		System.out.println(a);
		System.out.println(b);
		}
	static void staticDisp() {
		//System.out.println(a);
		//System.out.println(b);
	}
}
class Static7Rules{
	public static void main(String [] args) {
		Demos7 d1=new Demos7();
		d1.nonstaticDisp();
		d1.staticDisp();
		
	}
}