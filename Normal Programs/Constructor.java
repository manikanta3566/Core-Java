class Student{
	String name;
	int age;
	float height;
	Student(String s, int a, float h){
		name=s;
		age=a;
		height=h;

	}
}
	class Constructor{
		public static void main(String [] args){
			Student s1=new Student("rama",18,5.5f);
			System.out.println(s1.name);
			System.out.println(s1.age);
			System.out.println(s1.height);
		}
	}