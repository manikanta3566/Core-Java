class Fan{
	String color;
	int cost;
}
class FanApp{
	public static void main(String [] args){
		Fan f1;
		f1=new Fan();
		f1.color="blue";
		f1.cost=10;
		System.out.println(f1.color);
		System.out.println(f1.cost);
		Fan f2;
		f2=f1;
		f2.color="red";
		f2.cost=20;
		System.out.println(f1.color);
		System.out.println(f1.cost);
		System.out.println(f2.color);
		System.out.println(f2.cost);
		Fan f3;
		f3=f1;
		f2.color="green";
		f2.cost=30;
		System.out.println(f1.color);
		System.out.println(f1.cost);
		System.out.println(f2.color);
		System.out.println(f2.cost);
		System.out.println(f2.color);
		System.out.println(f2.cost);

	}
}