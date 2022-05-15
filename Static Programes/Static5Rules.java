class Demos5{
	int a,b;
	static int x,y;
	static {
		x=10;
		y=20;
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
		System.out.println(x);
		System.out.println(y);
	}
}
class Static5Rules{
	public static void main(String [] args) {
		Demos5 d1=new Demos5();
		d1.nonstaticDisp();
		d1.staticDisp();
		
	}
}