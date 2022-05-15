//Between the classes
class Parent{
	Parent(){
		System.out.println("Parent constructor");
	}
}
class child extends Parent{
	child(){
		System.out.println("child constructor");
	}
}
class ConstructorChaining{
	public static void main(String [] args) {
		child c=new child();
	}
}