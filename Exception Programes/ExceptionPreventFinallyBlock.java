class ExceptionPreventFinallyBlock{
	public static void main(String [] args) {
		int a=10,b=5,c;
		try {
			System.out.println("try executed");
			System.exit(0);
			
		}
		catch(Exception e) {
			System.out.println("problem in div");
			
		}
		finally {
			System.out.println("finally block executed");
		}
	}
}