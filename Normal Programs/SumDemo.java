import java.util.Scanner;
class SumDemo{
	public static void main(String [] args){
		int sum,digit,n;
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter the number");
		n=Scan.nextInt();
		sum=0;
		while(n!=0)
		{
			digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println(sum);
	}
}