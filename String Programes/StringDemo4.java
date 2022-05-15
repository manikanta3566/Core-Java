class StringDemo4
{
	public static void main(String [] args){
		String s1="rama";
		String s2="rama";
		String s3="rama";
		String s4="sita";
				if(s1==s4){
			System.out.println("ref are pointing to the same object");
		}
		else
		{
			System.out.println("ref are not pointing to the same object");
		}
	}
}