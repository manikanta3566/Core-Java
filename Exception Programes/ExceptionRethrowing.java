class Demo1{
	void fun1() {
		System.out.println("entering fun1");
		try {
			fun2();
		}
		catch(Exception e) {
			System.out.println("exception caught in fun1");
			throw e;
		}
	}
	void fun2() {
		System.out.println("entering fun2");
		try {
			int a=10,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("exception caught in fun2");
		throw e;
		}
	}

	}
class ExceptionRethrowing{
	public static void main(String [] args) {
		System.out.println("entering main method");
		Demo1 d1=new Demo1();
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
