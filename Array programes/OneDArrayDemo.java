import java.util.Scanner;
class OneDArrayDemo{
	public static void main(String [] args){
		int a[];
		a=new int[5];
		Scanner scan =new Scanner(System.in);
		int i;
		for(i=0;i<=a.length-1;i++)
		{
			System.out.println("enter the element");
			a[i]=scan.nextInt();
		}
		for(i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}