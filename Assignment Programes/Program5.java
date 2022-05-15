class Program5{
	public static void main(String [] args) {
		String s1="Pentagon Space";
		int i=s1.length()-1;
		String res=" ";
		
		while(i>=10) {
			res=res+s1.charAt(i);
			i--;
		}
		res=res+s1.substring(0,10);
		System.out.println(res);
		}
}
