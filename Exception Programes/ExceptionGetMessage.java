class ExceptionGetMessage{
	public static void main(String [] args) {
		int a=10,b=0,c;
		try {
			c=a/b;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("exiting main");
	}
}