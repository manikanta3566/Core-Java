class parent3{
	void con1() {
		System.out.println("connecting ds1");
	}
	void con2() {
		System.out.println("connecting excel");
	}
	void con3() {
		System.out.println("connecting ds3");
	}
}
class child3 extends parent3{
	void con1() {
		System.out.println("connecting oracle");
	}
}
class Inheritance2{
	public static void main(String [] args) {
		child3 c3=new child3();
		c3.con1();
		c3.con2();
		c3.con3();
	}
}
