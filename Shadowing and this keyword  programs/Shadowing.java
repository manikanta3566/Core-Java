class Student{
	String name;
	int age;
	float height;
	public void setdata(String n, int a, float h){
		name=n;
		age=a;
		height=h;
	}
}
class Shadowing{
	public static void main(String [] args){
		Student s1=new Student();
		s1.setdata("rama",18,5.6f);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.height);

	}
}