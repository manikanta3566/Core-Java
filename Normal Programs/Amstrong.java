import java.util.Scanner;
class Amstrong{
	public static void main(String [] args){
		int sum,digit,n,n1;
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter the number");
		n=Scan.nextInt();
		n1=n;
		sum=0;
		while(n!=0)
		{
			digit=n%10;
			sum=sum+(digit)*(digit)*(digit);
			n=n/10;
		}
		if(n1==sum)
		{
			System.out.println("it is an Amstrong number");
		}
		else
		{
			System.out.println("not an Amstrong number");
		}
	}
}