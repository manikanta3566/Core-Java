class Program1{
	public static void main(String [] args) {
		String s1="Pentagon Space";
		int length=s1.length();
		String res=" ";
		for(int i=length-1;i>=0;i--) {
			res=res+s1.charAt(i);
		}
		System.out.println(res);
		
	}
}