class Parent1
{
	Parent1(){
		System.out.println("Parent constructor");
		}
}
class Child1 extends Parent1{
	Child1(){
		this(10);
		System.out.println("zero parameter constructor");
	}
	Child1(int a){
		this(10,20);
		System.out.println("one parameter constructor");
	}
	Child1(int a,int b){
		System.out.println("two parameter constructor");
	}
}
class SuperThisKeyword{
	public static void main(String [] args) {
		Child1 c1=new Child1();
	}
	
}