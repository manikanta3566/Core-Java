class Additions{
	void add(int x, long y ){
		long z;
		z=x+y;
		System.out.println(z);
	}
	void add(long x, int y){
		long z;
		z=x+y;
		System.out.println(z);
	}
}
class NumericType{
	public static void main(String [] args){
		int a,b;
		Additions a1=new Additions();
		a=10;
		b=20;
		
		a1.add(a,b);
	}
}
