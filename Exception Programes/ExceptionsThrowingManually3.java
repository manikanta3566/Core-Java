import java.util.Scanner;
class ExceptionsThrowingManually3{
	public static void main(String [] args) {
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value of a");
		a=scan.nextInt();
		System.out.println("enter the value of b");
		b=scan.nextInt();
		try {
			if(a>b) {
				c=a-b;
				System.out.println(c);
			}
			else {
				ALessThanBException2 e=new ALessThanBException2();
				throw e;
			}
		}
		catch(ALessThanBException2 e) {
			System.out.println(e.getMessage());
		}
		System.out.println("exiting main normally");
	}
}
class ALessThanBException2 extends Exception{
	public String getMessage() {
		return "a is less than b";
	}
	
}