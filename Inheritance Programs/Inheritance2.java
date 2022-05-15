class A1{
	int i;
}
class B1 extends A1{
	int i;
	void setdata(int x , int y) {
	super.i=x;
		i=y;
		
}
	void disp()
	{
		System.out.println("A constructor is" +  super.i);
		System.out.println("B constructor is" +  i);
	}
}
class Inheritance2{
	public static void main(String [] args) {
		B1 b1=new B1();
		b1.setdata(10, 20);
		b1.disp();
	}
}
