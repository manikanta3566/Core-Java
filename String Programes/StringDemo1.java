class StringDemo1{
	public static void main(String [] args){
		String S1="RajaRamMohanRoy";
		System.out.println(S1.length());
		System.out.println(S1.charAt(5));
		System.out.println(S1.indexOf('R'));
		System.out.println(S1.lastIndexOf('R'));
		System.out.println(S1.toUpperCase());
		System.out.println(S1.toLowerCase());
		System.out.println(S1.substring(7));
		System.out.println(S1.substring(4,10));
	}
}