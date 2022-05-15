
class Thread1 extends Thread{
	@Override
	public void run(){
		int i=0;
		while(i<5) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("welcome");
		i++;
		}	
	}
}
class Thread2 extends Thread{
	@Override
	public void run() {
		int i=0;
		while(i<5) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("to earth");
			i++;
		}
	}
}
class ExtendingClass{
	public static void main(String[] args) {
Thread1 t1=new Thread1();
t1.setPriority(10);
Thread2 t2=new Thread2();
t1.start();
System.out.println(t1.getState());
t2.start();
System.out.println(t2.getPriority());
System.out.println(t1.getPriority());
System.out.println(t2.getState());
	}
}