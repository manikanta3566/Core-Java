class StringDemo8{
	public static void main(String [] args){
		String s1="rama" + "sita";
		System.out.println(s1);
		String s2="rama" + "sita";
        System.out.println(s2);
        if(s1==s2)
        {
        	System.out.println("s1 and s2 are pointing to the same object");
        }
        else
        {
        	System.out.println("s1 and s2 are not pointing to the same object");
        }
        String s3="rama";
        String s4="sita";
        String s5=s3+s4;
        System.out.println(s5);
        String s6=s4+s5;
System.out.println(s6);
if (s5==s6) {
	System.out.println("s5 and s6 are pointing to the same object");
}
else
{
	System.out.println("s5 and s6 are not pointing to the same object");
}

}
	
}