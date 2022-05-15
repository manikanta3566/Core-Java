class Calculator{
	int add(int x , int y){
		int z;
		z=x+y;
		return z;


	}
}
class CalculatorApp3{
	public static void main(String [] args){
		Calculator c1;
		c1=new Calculator();
		int a,b,res;
		a=10;
		b=20;
		res=c1.add(a,b);
		System.out.println(res);
	}
}