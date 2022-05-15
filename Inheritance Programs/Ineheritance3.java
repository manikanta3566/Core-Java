class parent2{
	parent2(){
		System.out.println("parent constructor ");
	}
	{
		System.out.println("parent non static block");
	}
}
class child2 extends parent2{
	child2(){
		System.out.println("child constructor");
	}
	{
		System.out.println("child non static block");
	}
}
class Inheritance06{
	public static void main(String [] args) {
		child2 c1=new child2();
	}
}