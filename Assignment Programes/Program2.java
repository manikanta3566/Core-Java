class Program2{
	public static void main(String [] args) {
		String s1="Pentagon Space";
		int length=s1.length();
		String res=" ";
		for(int i=length-9;i>=0;i--) {
			res=res+s1.charAt(i);
		}
		res=res+s1.substring(6);
		System.out.println(res);
				
	}
}