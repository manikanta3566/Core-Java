class StringIntern{
	public static void main(String [] args){
		String s1=new String("rama");
		String s2;
		s2=s1.intern();
		String s3="rama";
		if(s2==s3){
			System.out.println("s2 and s3 are pointing to the same object");
		}
		else{
			System.out.println("s2 and s3 are not pointing to the same object");
		}
	}
}