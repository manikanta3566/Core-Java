class Demo{
	void Swap(int x, int y)
	{
		int temp;
		temp=x;
		x=y;
		y=temp;
	}
}
class SwapDemo{
	public static void main(String [] args){
		Demo d1;
		d1=new Demo();
		int a,b;
		a=10;
		b=20;
		System.out.println("before swapping");
		System.out.println(a);
		System.out.println(b);
		d1.Swap(a,b);
		System.out.println("after swapping");
		System.out.println(a);
		System.out.println(b);
	}
}