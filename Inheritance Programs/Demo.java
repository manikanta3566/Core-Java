class Person{
	Heart h=new Heart();
	Brain b=new Brain();
	knowledge k=new knowledge();
	Person(){
		System.out.println("person is ready");
	}
 }
class Employee extends Person{
	Employee(){
		System.out.println("employee is person");
	}
	void hasA(Car c) {
		System.out.println("employee purchased car");
	}
	void hasA(Property p) {
		System.out.println("employee purchased property");
	}
}

	class knowledge{
		knowledge(){
			System.out.println("employee has a knowledge");
		}
		void checkknowledge() {
			System.out.println("knowledge is medium");	
		}
	
}
class Heart{
	Heart(){
		System.out.println("Person has a heart");
	}
	void checkheart() {
		System.out.println("heart is pumping blood");
	}
}
class Brain{
	Brain(){
		System.out.println("person has a brain");	
	}
	void checkbrain() {
		System.out.println("brain is working");
	}
	
}

class Car{
	Car(){
		System.out.println("car created");
		
	}
	void getcar() {
		System.out.println("employee can access car");
	}
	
 }

class Property{
	Property(){
		System.out.println("employee created");
	}
	void getproperty() {
		System.out.println("employee has a property");
	}
}
class Demo{
	public static void main(String [] args) {
		Person p1=new Person();
		Employee e=new Employee();
	
		Car c=new Car();
		Property p=new Property();
		e.hasA(c);
		e.hasA(p);
		p1.h.checkheart();
		p1.b.checkbrain();
		p1.k.checkknowledge();
	p1=null;
	//p1.h.checkheart(); //p1 set to null so the object p1 is destroyed and its instance objects also destroyed
	//p1.b.checkbrain();//p1 set to null so the object p1 is destroyed and its instance objects also destroyed
	//p1.k.checkknowledge();//p1 set to null so the object p1 is destroyed and its instance objects also destroyed
	c.getcar();//we can access agreigate objects
	p.getproperty();//we can access agreigate objects


	}
}