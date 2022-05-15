class Addition{
	void add(){
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}
	void add(int a)
	{
		int b,c;
		b=20;
		c=a+b;
		System.out.println(c);
	}
	void add( int a, int b){
		int c;
		c=a+b;
		System.out.println(c);

	}
	void add( float a, float b){
		float c;
		c=a+b;
		System.out.println(c);
	}
	void add(double a,double b){
		double c;
		c=a+b;
		System.out.println(c);
	}
	void add( int a, float b){
		float c;
		c=a+b;
		System.out.println(c);


	}
	void add( float a, int b){
		float c;
		c=a+b;
		System.out.println(c);
	}
	void add(int a, float b , double c){
		double res;
		res=a+b+c;
		System.out.println(res);
	}
}
class AdditionDemo{
	public static void main(String [] args){
		int a,b,c;
		a=10;
		b=20;
		c=30;
		float x,y,z;
		x=10.1f;
		y=20.1f;
		z=30.1f;
		double t,u,v;
		t=80.1;
		u=90.1;
		v=100.1;
		Addition a1=new Addition();
		a1.add();
		a1.add(a);
		a1.add(a,b);
		a1.add(x,y);
		a1.add(t,u);
		a1.add(a,x);
		a1.add(y,b);
		a1.add(a,x,t);
	}
}

	