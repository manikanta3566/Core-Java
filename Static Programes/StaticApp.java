import java.util.Scanner;
class Farmer{
	float p,t,SI;
	static float r;
	void input() {
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter the principal");
		p=Scan.nextFloat();
		System.out.println("enter the time");
		t=Scan.nextFloat();
	}
		static{
			r=2.25f;
		}
		void calsi() {
			SI=(p*t*r)/100;
			
		}
		void disp() {
			System.out.println("the value of SI:" + SI);
		
		
	}
}
class StaticApp{
	public static void main(String [] args) {
		Farmer f1=new Farmer();
		Farmer f2=new Farmer();
		Farmer f3=new Farmer();
		f1.input();
		f1.calsi();
		f1.disp();
		f2.input();
		f2.calsi();
		f2.disp();
		f3.input();
		f3.calsi();
		f3.disp();
		
		
	}
}