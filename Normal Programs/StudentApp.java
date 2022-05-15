class Student{
	String name;
	int age;
}
class StudentApp{
	public static void main(String [] args){
		Student s1;
		s1=new Student();
		System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1);
	}
}