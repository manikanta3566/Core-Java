class Demos4{
	int a,b;
	static int x,y;
	void nonstaticDisp() {
		System.out.println("non static disp executed");
		}
	static void staticDisp() {
		System.out.println("static disp executed");
	}
}
class Static4Rules{
	public static void main(String [] args) {
		Demos4 d1=new Demos4();
		d1.a=10;
		d1.b=20;
		d1.nonstaticDisp();
		//Demos4.a=77;
		//Demos4.b=88;
		//Demo.nonstaticDisp();
		d1.x=40;
		d1.y=50;
		d1.staticDisp();
		Demos4.x=60;
		Demos4.y=70;
		Demos4.staticDisp();
	}
}