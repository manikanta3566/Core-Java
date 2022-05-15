class StringDemo3
{
	public static void main(String [] args){
		String s1="rama";
		String s2="rama";
		if(s1==s2){
			System.out.println("ref are pointing to the same object");
		}
		else
		{
			System.out.println("ref are not pointing to the same object");
		}
	}
}