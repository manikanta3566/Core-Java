class Demo{
	void  Demo()
	{
		System.out.println("inside demo constructor");
	}
	void disp(){
		System.out.println("inside disp");
	}
}
class Demo3{
	public static void main(String [] args){
		Demo d1=new Demo();
		d1.Demo();
		d1.disp();
		
	}
}