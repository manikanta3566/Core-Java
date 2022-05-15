import java.util.Scanner;

		
	
	class Student{
	public  static void main(String [] args) {
		String name,usn;
		int n,perc,total=0;
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter the name");
		name=Scan.next();
		System.out.println("enter the usn");
		usn=Scan.next();
		System.out.println("enter the number of subjects");
		n=Scan.nextInt();
		System.out.println("enter the marks");
		
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++) {
			a[i]=Scan.nextInt();
			total=a[i]+total;
		}
		perc=total/n;
		System.out.println("sum"+total);
		System.out.println("percentage" +perc);
		if(perc>80) {
			System.out.println("FCD");
			
		}
		 else if(perc>35) {
			System.out.println("first class");
		}
		  else if(perc<35){
			System.out.println("fail");
		}
		
		
	
	}
	}


	

		
