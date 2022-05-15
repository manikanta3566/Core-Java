import java.util.Scanner;
class Exception2{
	public static void main(String [] args) {
		Scanner Scan=new Scanner(System.in);
		int i;
		int a[]=new int[5];
		for(i=0;i<=a.length-1;i++) {
			System.out.println("enter the value");
			a[i]=Scan.nextInt();
		}
		try
		{
		for(i=0;i<=10;i++) {
			System.out.println(a[i]);
		}
		}
		catch(Exception e) {
			System.out.println("problem in accesing the array");
		}
		System.out.println("Exiting main normally");
	}
}