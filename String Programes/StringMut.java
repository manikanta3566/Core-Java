class StringMut{
public static void main(String [] args){
	StringBuilder s=new StringBuilder();
	System.out.println(s.capacity());
	System.out.println(s.length());
	s.append("sachin");
	System.out.println(s.capacity());
	System.out.println(s.length());
	s.append(" is a great batsman");
	System.out.println(s.capacity());
	System.out.println(s.length());
	s.append(" he is from india");
	System.out.println(s.capacity());
	System.out.println(s.length());

}
}