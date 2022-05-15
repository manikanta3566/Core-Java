class StringDemo6
{
	public static void main(String [] args){
		String s1=new String("rama");
		String s2=new String("rama");
				if(s1==s2){
			System.out.println("s1 and s2 are pointing to the same object");
		}
		else
		{
			System.out.println("s1 and s2 are not pointing to the same object");
		}
	}
}