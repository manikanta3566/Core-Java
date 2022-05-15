class StringIgnoreCase{
	public static void main(String [] args){
		String s1="Rama";
		String s2="RAMA";
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("s1 and s2 are equal");
		}
		else{
			System.out.println("s1 and s2 are not equal");
		}
	}
}