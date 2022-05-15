import java.util.Scanner;
class Palindrome{
public static void main(String [] args){
	String s1;
	Scanner Scan=new Scanner(System.in);
	System.out.println("enter the String");
	s1=Scan.next();
	int m;
m=s1.length();
char org[]=new char[m];
char rev[]=new char[m];
int i,j;
for(i=0;i<=s1.length()-1;i++)
{
org[i]=s1.charAt(i);
}
i=m-1;
j=0;
while(i>=0)
{
	rev[j]=org[i];
	i--;
	j++;
}
boolean status;
status =Arrays.equals(org,rev);
if(status==true){
	System.out.println("String is palindrome");
}
else{
	System.out.println("String is not palindrome");
}


}
}