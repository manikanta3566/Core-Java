class Additions{
	void add(int x, int y ){
		int z;
		z=x+y;
		System.out.println(z);
	}
	int add(int a, int b){
		int c;
		c=a+b;
		return c;
	}
}
class Demo2{
	public static void main(String [] args){
		int a,b;
		Additions a1=new Additions();
		a=10;
		b=20;
		
		a1.add(a,b);
	}
}
