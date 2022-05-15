class ExceptionFinallyBlock{
	public static void main(String [] args) {
		System.out.println("Main method connected to Db");
		Demo2 d2=new Demo2();
		try {
			d2.fun1();
		}
		catch(Exception e) {
			System.out.println("exception caught in main");
		}
		finally {
			System.out.println("closing Db connection by main");
		}
}
}
class Demo2{
	void fun1() {
		System.out.println("fun1 connected to Db");
		try {
			fun2();
		}
		catch(Exception e)
		{
			System.out.println("exception caught in fun1");
		throw e;
		}
		finally {
			System.out.println("closing Db connection by fun1");
		}
	}
void fun2() {
	System.out.println("fun2 connected to Db");
	try {
		int a=10,b=0,c;
		c=a/b;
	}
	catch(Exception e) {
		System.out.println("Exception caught in fun2");
		throw e;
	}
	finally {
		System.out.println("closing Db by fun2");
	}
}
	
}