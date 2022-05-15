class Student{
	String name;
	int age;
	float height;
	 void setdata(String name, int age, float height){
		this.name=name;
		this.age=age;
		this.height=height;
	}
}
class This1{
	public static void main(String [] args){
		Student s1=new Student();
		s1.setdata("rama",18,5.6f);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.height);
		Student s2=new Student();
		s2.setdata("abhi",19,5.7f);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.height);


	}
}