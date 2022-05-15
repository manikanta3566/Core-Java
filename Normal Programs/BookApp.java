class book{
	int pages;
}
class BookApp{
	public static void main(String [] args){
		book b1=new book();
		b1.pages=100;
		System.out.println(b1.pages);
		b1.pages=-99;
		System.out.println(b1.pages);

	}
}