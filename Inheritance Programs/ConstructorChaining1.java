class Demo1{
	Demo1(){
		this(10);
		System.out.println("zero parameter constructor");
	}
	Demo1(int a){
		this(10,20);
		System.out.println("one parameter constructor");
	}
	Demo1(int a,int b){
		System.out.println("two parameter constructor");
	}
}
class ConstructorChaining1{
	public static void main(String [] args) {
		Demo1 d=new Demo1();
	}
}