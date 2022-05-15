class Demos9{
	static {
		System.out.println(" second static block ");
	}
	static {
		System.out.println(" first static block ");
	}
	static {
		System.out.println(" third static block ");
	}
	{
		System.out.println(" third non static block ");
	}
	{
		System.out.println(" second nonstatic block ");
	}
	{
		System.out.println(" first nonstatic block ");
	}
}
class Static9{
	public static void main(String [] args) {
		Demos9 d1=new Demos9();
		Demos9 d2=new Demos9();
		Demos9 d3=new Demos9();
	}
}


	


