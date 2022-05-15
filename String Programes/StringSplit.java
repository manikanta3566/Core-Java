import java.util.Scanner;
import java.util.StringTokenizer;
class StringSplit{
	public static void main(String [] args){
		String s1;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String");
		s1=scan.next();
		StringTokenizer stk=new StringTokenizer(s1,",");
		while(stk.hasMoreTokens()){
			String token=stk.nextToken();
			System.out.println(token);
		}
	}
}