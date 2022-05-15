class Student{
	String name;
	int age;
	float height;
	Student(String s, int a, float h){
		name=s;
		age=a;
		height=h;

	}
	Student(){
		name=null;
		age=0;
		height=0.0f;
	}
	
}
	class ConstructorOverloading{
		public static void main(String [] args){
			Student s1=new Student("rama",18,5.5f);
			System.out.println(s1.name);
			System.out.println(s1.age);
			System.out.println(s1.height);
			Student s2=new Student();
			System.out.println(s2.name);
			System.out.println(s2.age);
			System.out.println(s2.height);
		}
	}