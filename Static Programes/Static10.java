//write a java program to count the total number of objects created for a specific class

class Demos10{
	int a,b;
	static int count;
{
		count++;
	}
	
	}
class Static10{
	public static void main(String [] args) {
		Demos10 d1=new Demos10();
		Demos10 d2=new Demos10();
		Demos10 d3=new Demos10();
		System.out.println("the value of object:" + Demos10.count);
	}
}