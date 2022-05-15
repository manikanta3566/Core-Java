class Program6{
	
	public static void main(String [] args) {
		String str="Pentagon Space";
		
		System.out.println("old string is=" +str);
		System.out.println("new String is="+ removeduplicates(str));
	}
		
		public static String removeduplicates(String str) {
			String newstring="";
			int i=0;
			int length=str.length();
			while(i<length) {
				char ch=str.charAt(i);
				if(newstring.indexOf(ch)==-1) {
					newstring=newstring+ch;
				}
				i++;
			}
					return newstring;
		}
}