class Demo{
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
class Demo1{
	public static void main(String [] args){
		int a,b;
		Addition a1=new Addition();
		a=10;
		b=20;
		
		a1.add(a,b);
	}
}

