import java.util.Scanner;
abstract class shape{
	float area;
	abstract void input();
	abstract void calarea();
	void disp() {
		System.out.println("area is"+area);
	}
}
class square extends shape{
	float l;
	void input() {
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter length");
		l=Scan.nextFloat();
	}
	void calarea() {
		area=l*l;
	}
}
class rectangle extends shape{
	float l,b;
	void input() {
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter length");
		l=Scan.nextFloat();
		System.out.println("enter breadth");
		b=Scan.nextFloat();
	}
	void calarea() {
		area=l*b;
	}
}
class circle extends shape{
	float r;
	void input() {
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter the radius");
		r=Scan.nextFloat();
	}
	void calarea() {
		area=3.14f*r*r;
	}
}
class geometry{
	void allowshape(shape ref) {
		ref.input();
		ref.calarea();
		ref.disp();
	}
}
class AbstractShapeApp{
	public static void main(String [] args) {
		square s=new square();
		rectangle r=new rectangle();
		circle c=new circle();
		geometry g=new geometry();
		g.allowshape(s);
		System.out.println();
		g.allowshape(r);
		System.out.println();
		g.allowshape(c);
	}
}