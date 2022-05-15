import java.util.Scanner;
class TwoDArrayDemo{
	public static void main(String [] args){
		int a[][];
		a=new int[3][4];
		Scanner scan=new Scanner(System.in);
		int i,j;
		for(i=0;i<=a.length-1;i++)
		{
			for(j=0;j<=a[i].length-1;j++)
			{
				System.out.println("enter the element");
				a[i][j]=scan.nextInt();

			}
		}
for(i=0;i<=a.length-1;i++)
{
	for(j=0;j<=a[i].length-1;j++)
	{
		System.out.print(a[i][j] +" ");
	}
	System.out.println();
	}
}
}