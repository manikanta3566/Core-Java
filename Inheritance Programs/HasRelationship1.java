class heart{
	heart(){
		System.out.println("heart created");
	}
	void checkheart() {
		System.out.println("heart is pumping blood");
	}
}
class brain{
	brain(){
		System.out.println("brain created");
	}
	void checkbrain() {
		System.out.println("brain is working");
	}
}
class car{
	car(){
		System.out.println("car is created");
		
	}
	void car() {
		System.out.println("car is ready for driving");
	}
}
class Person{
	heart h=new heart();
	brain b=new brain();
	Person(){
	System.out.println("person is ready");	
	}
	void hasA(car c) {
		System.out.println("person is driving car");
	}
}
class HasRelationship1{
	public static void main(String [] args) {
		Person p=new Person();
		car c=new car();
		p.h.checkheart();
		p.b.checkbrain();
		c.car();
		p.hasA(c);
		p=null;
		//p.h.checkheart();//p is to null and p object is destryoyed and its instance object also destroyed
		//p.b.checkbrain();//p is to null and p object is destryoyed and its instance object also destroyed
		c.car();
		
		
	}
}