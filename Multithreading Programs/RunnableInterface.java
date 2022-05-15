class Demo1 implements Runnable{
	@Override
	public void run() {
		int i=0;
		while(i<5) {
			System.out.println("hii");
		i++;
		}
		
	}
	
}
class Demo2 implements Runnable{
	@Override
	public void run() {
		int i=0;
		while(i<5) {
			System.out.println("hello");
		i++;
		}
	}
	
}
class RunnableInterface{
	public static void main(String[] args) {
		Demo1 t=new Demo1();
		Thread t1=new Thread(t);
		Demo2 tt=new Demo2();
		Thread t2=new Thread(tt);
		//t1.start();
		///try {
		//	t1.join();
		//} catch (InterruptedException e) {
		//	e.printStackTrace();
		//}
		t2.start();	
	}
}