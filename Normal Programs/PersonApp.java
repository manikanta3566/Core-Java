import java.util.Scanner;
class Person{
	String name;
	int age;
}
class PersonApp{
	public static void main(String [] args){
		int i;
		Scanner scan=new Scanner(System.in);
		Person p[];
		p=new Person[4];
		p[0]=new Person();
		p[1]=new Person();
		p[2]=new Person();
		p[3]=new Person();
		for(i=0;i<=3;i++)
		{
			System.out.println("enter the name");
			p[i].name=scan.next();
			System.out.println("enter the age");
			p[i].age=scan.nextInt();

		}
		for(i=0;i<=3;i++)
		{
			System.out.println(p[i].name);
			System.out.println(p[i].age);
		}


	}
}