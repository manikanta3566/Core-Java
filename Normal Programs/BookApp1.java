class book{
	private int pages;
	public void  setdata(int x){
		if(x>0){
			pages=x;
		}
	}
		public int getdata(){
			return pages;
		
	}
}
class BookApp1{
	public static void main(String [] args){
		book b1=new book();
		b1.setdata(100);
		b1.setdata(-99);
		int m=b1.getdata();
		System.out.println("values of pages"+ m);

	}
}