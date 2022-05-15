class Persons1{
	Heart1 h=new Heart1();
	Brain1 b=new Brain1();
	Persons1(){
		System.out.println("person is ready");
	}
 }
class Employee extends Persons1{
	knowledge k=new knowledge();
	Employee(){
		System.out.println("employee is person");
	}
	class knowledge{
		knowledge(){
			System.out.println("employee has a knowledge");
		}
		void checkknowledge() {
			System.out.println("knowledge is medium");	
		}
	}
}
class Heart1{
	Heart1(){
		System.out.println("Person has a heart");
	}
	void checkheart() {
		System.out.println("heart is pumping blood");
	}
}
class Brain1{
	Brain1(){
		System.out.println("person has a brain");	
	}
	void checkbrain() {
		System.out.println("brain is working");
	}
	
}
class Car1{
	Car1(){
		System.out.println("employee has car");
		
	}
	void checkcar(Car1 c1) {
		System.out.println("car is ready");
	}
}
class Property{
	Property(){
		System.out.println("employee has property");
	}
	void checkproperty(Property p) {
		System.out.println("property is checked");
	}
}
class InheritanceHasARelation{
	public static void main(String [] args) {
		Persons1 p1=new Persons1();
		Employee e=new Employee();
		Car1 c1=new Car1();
		Property p=new Property();
		
		
	}
}

	