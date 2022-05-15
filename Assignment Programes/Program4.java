class Program4{
	public static void main(String [] args) {
		String s1="Pentagon Space";
		int i=s1.length();
		String res=" ";
		
		while(i>0) {
			res=res+s1.charAt(i-1);
			i--;
		}
		System.out.println(res);
		}
}
