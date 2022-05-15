class Parent{
	void disp() {
		System.out.println("Inside Parent");
	}
}
class Child1 extends Parent{
	void disp() {
		System.out.println("Inside Child1");
		
	}
}
class Child2 extends Parent{
	void disp() {
		System.out.println("Inside child2");
	}
}
class InheritanceDemo{
	public static void main(String [] args) {
		Parent p=new Parent();
		Child1 c1=new Child1();
		Child2 c2=new Child2();
		Parent ref;
		ref=p;
		ref.disp();
		ref=c1;
		ref.disp();
		ref=c2;
		ref.disp();
	}
}