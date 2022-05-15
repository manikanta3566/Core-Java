class Demos8{
	static {
		System.out.println(" first static block ");
	}
	static {
		System.out.println(" second static block ");
	}
	static {
		System.out.println(" third static block ");
	}
	{
		System.out.println(" first non static block ");
	}
	{
		System.out.println(" second nonstatic block ");
	}
	{
		System.out.println(" third nonstatic block ");
	}
}
class Static8{
	public static void main(String [] args) {
		Demos8 d1=new Demos8();
		Demos8 d2=new Demos8();
		Demos8 d3=new Demos8();
	}
}


	


