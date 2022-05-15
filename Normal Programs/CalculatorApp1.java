class Calculator{
	void add()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}
}
class CalculatorApp{
	public static void main(String [] args){
		Calculator c1;
		c1=new Calculator();
		c1.add(); 
	}
}
