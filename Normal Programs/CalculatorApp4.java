class Calculator{
	int add()
	{
int x,y,z;
x=10;
y=20;
z=x+y;
return z;
	}
}
class CalculatorApp4{
	public static void main(String [] args){
		Calculator c1;
		c1=new Calculator();
		int res;
		res=c1.add();
		System.out.println(res);
	}
}