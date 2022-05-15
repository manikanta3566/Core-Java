class StringMethods{
	public static void main(String [] args) {
		String s="Welcome To Java";
		String s1=" hi ";
		String s3="rryayarryrry";
		System.out.println(s.length());
		System.out.println(s.charAt(1));
		System.out.println(s.contains(s1));
		System.out.println(s.contains(s));
		System.out.println(s.substring(2));
		System.out.println(s.substring(2,6));
		System.out.println(s.equals("Welcome To Java"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.concat(s1));
		System.out.println(s1.trim());
		System.out.println(s.replace('c','k'));
		System.out.println(s.replace("Java","python"));
		System.out.println(s.replace("W","wel"));
		System.out.println(s.startsWith("Welcome"));
		System.out.println(s.endsWith("Java"));
		System.out.println(s.indexOf('e'));
		System.out.println(s3.indexOf("rry"));
		System.out.println(s3.indexOf("ry",5));
		System.out.println(s3.indexOf("rry1234"));
		System.out.println(s3.lastIndexOf("rry"));
		System.out.println(s3.lastIndexOf("rya",5));
		System.out.println(s.equalsIgnoreCase("welcome To java"));
		
		 }
}