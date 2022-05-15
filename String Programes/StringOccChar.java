import java.util.Scanner;
class StringOccChar{
	public static void main(String [] args){
		String s;
		char ch;
		Scanner Scan =new Scanner(System.in);
		System.out.println("enter the String");
		s=Scan.next();
		System.out.println("enter the character");
		try{
		ch=(char)System.in.read();
		int m,i;
		m=s.length();
		int count,count=0;
		for(i=0;i<=m-1;i++)
		{
			if(s.charAt(i)==ch)
			{
			count++;
			}
		}
			System.out.println(count);
		}
		catch(Exception e){
			System.out.println();
		}
	}
}