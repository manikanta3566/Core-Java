interface compute2{
	void add();
	void sub();
}
class Addition2 implements compute2{
	public void add() {
		int a=20,b=10,c;
		c=a+b;
		System.out.println(c);
	}
	public void sub() {
		int a=30,b=20,c;
		c=a-b;
		System.out.println(c);
	}
	void mul() {
		int a=20,b=10,c;
		c=a*b;
		System.out.println(c);
	}
}
class Demo2 {
	public static void main(String [] args) {
		Addition2 a=new Addition2();
		compute2 ptr;
		ptr=a;
		ptr.add();
		ptr.sub();
		((Addition2)(ptr)).mul();
	}
}
