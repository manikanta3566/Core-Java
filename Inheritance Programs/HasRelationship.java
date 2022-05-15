class os{
	os(){
		System.out.println("os installed");
	}
	void checkos() {
		System.out.println("os checked");
	}
}
class charger{
	String name;
	charger(String s){
		name=s;
	System.out.println("charger created");
		
	}
	void getcharger() {
		System.out.println("charger accquired");
	}
}
class mobile{
	os o=new os();
	mobile(){
		System.out.println("mobile created");
		
	}
	void hasA(charger c) {
		System.out.println("charger connected to mobile");
	}
}
class HasRealtionship{
	public static void main(String [] args) {
		mobile m=new mobile();
	charger c=new charger("iphone");
	m.o.checkos();
	m.hasA(c);
	c.getcharger();
	m=null;
	//m.o.checkos();m is to null and m object is destryoyed and its instance object also destroyed
	c.getcharger();
	
	
	
	}
}