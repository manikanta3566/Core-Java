import java.util.Scanner;
class ExceptionsThrowingManually2{
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
				ALessThanBException e=new ALessThanBException();
				throw e;
			}
		}
		catch(ALessThanBException e) {
			System.out.println("sub is not possible");
		}
		System.out.println("exiting main normally");
	}
}
class ALessThanBException extends Exception{
	ALessThanBException(){
		System.out.println("a is less than b");
	}
	
}