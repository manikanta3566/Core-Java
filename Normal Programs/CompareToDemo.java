import java.util.Scanner;
class CompareToDemo{
	public static void main(String [] args){
		String s1,s2;
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter the String1");
		s1=Scan.next();
		System.out.println("enter the String2");
		s2=Scan.next();
		int res;
		res=s1.compareTo(s2);
		System.out.println(res);
		System.out.println();
		if(res==0)
		{
			System.out.println("String1 and String2 are equal");

		}
		else if(res>0)
		{
			System.out.println("s1>s2");
		}
		else
		{
			System.out.println("s1<s2");

		}
	}
}