class Program3{
	
	public static void main(String [] args) {
		String str="Pentagon Space";
		System.out.println("old string is=" +str);
		System.out.println("new String is ="+ removeduplicates(str));
	}
		
		public static String removeduplicates(String str) {
			String newstring="";
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				if(newstring.indexOf(ch)==-1) {
					newstring=newstring+ch;
				}
			}
					return newstring;
		}
}