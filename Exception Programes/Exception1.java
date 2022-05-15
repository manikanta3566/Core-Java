import java.util.Scanner;
class Exception1{
	public static void main(String [] args) {
Scanner Scan=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the value of a");
		a=Scan.nextInt();
		System.out.println("enter the value of b");
		b=Scan.nextInt();
		try
		{
		c=a/b;
		System.out.println("the value of c" +c);
		}
		catch(Exception e) {
			System.out.println("exiting main normally");
		}
	}
}