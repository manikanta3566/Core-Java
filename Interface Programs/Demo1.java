interface compute{
	void add();
	void sub();
}
class Addition implements compute{
	public void add() {
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}
	public void sub() {
		int a=20,b=10,c;
		c=a-b;
		System.out.println(c);
	}
}
class Demo1{
	public static void main(String [] args) {
		Addition a=new Addition();
		compute ptr;
		ptr=a;
		ptr.add();
		ptr.sub();
	}
}