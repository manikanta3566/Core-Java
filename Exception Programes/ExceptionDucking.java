class Demo{
	void fun1() {
		System.out.println("entering fun1");
		fun2();
	}
	void fun2() {
		System.out.println("entering fun2");
		int a=10,b=0,c;
		c=a/b;
		System.out.println(c);
	}
}
class ExceptionDucking{
	public static void main(String [] args) {
		Demo d1=new  Demo();
		try {
			d1.fun1();
		}
		catch(Exception e)
		{
			System.out.println("exception caught in main()");
		}
		System.out.println("exiting main normally");
		}
		
	}
