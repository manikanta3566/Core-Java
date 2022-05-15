class Demos11{
	int a,b;
	static int count;
	Demos11(){
	}
	{
		count++;
	}
	Demos11(int x){
		a=x;
		b=10;
	}
	Demos11(int x , int y){
		a=x;
		b=y;
	}
	
	}
class Static11{
	public static void main(String [] args) {
		Demos11 d1=new Demos11();
		Demos11 d2=new Demos11();
		Demos11 d3=new Demos11();
		Demos11 d4=new Demos11(40);
		Demos11 d5=new Demos11(50,60);
		System.out.println("the value of object:" + Demos11.count);
	}
}