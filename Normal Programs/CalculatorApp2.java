class Calculator{
	void add(int a, int b)
	{
		int z;
		z=a+b;
		System.out.println(z);

	}
}
class CalculatorApp2{
	public static void main(String [] args){
		Calculator c1;
		c1=new Calculator();
		int x,y;
		x=10;
		y=20;
		c1.add(x,y);
	}
}