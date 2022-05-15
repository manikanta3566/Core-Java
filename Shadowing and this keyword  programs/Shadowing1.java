class Student{
	String name;
	int age;
	float height;
	public void setdata(String name, int age, float height){
		name=name;
		age=age;
		height=height;
	}
}
class Shadowing1{
	public static void main(String [] args){
		Student s1=new Student();
		s1.setdata("rama",18,5.6f);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.height);

	}
}