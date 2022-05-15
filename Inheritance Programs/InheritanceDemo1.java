class Engineering{
	void Branch() {
		System.out.println(" branch");
		
	}
	final void Sem() {
		System.out.println("1st sem");
	}

 void Usn() {
	System.out.println("USN");
}
void Result() {
	System.out.println("Result");
	
}
}
class InformationScience extends Engineering{
	void Branch() {
		System.out.println("ISE");
	}
	 void Usn() {
		System.out.println("1BO17IS005");
	}
	void Result() {
		System.out.println("FCD");
	}
}
class Mechanical extends Engineering{
	void Branch() {
		System.out.println("ME branch");
	}
	 void Usn() {
		System.out.println("1BO17ME002");
	}
	void Result() {
		System.out.println("First class");
		
	}
}
class ComputerScience extends Engineering{
	void Branch()
	{
		System.out.println("CS branch");
	}
 void Usn() {
		System.out.println("1BO17CS003");
	}
	void Result() {
		System.out.println("FCD");
		
	}
}
class Civil extends Engineering{
	void Branch() {
		System.out.println("CIVIL branch");
	}
	 void Usn() {
		System.out.println("1BO17CV003");
	}
	void Result() {
		System.out.println("Second class");
		
	}
}
class InheritanceDemo1{
	public static void main(String [] args) {
		InformationScience Is=new InformationScience();
		Mechanical m=new Mechanical();
		ComputerScience cs=new ComputerScience();
		Civil cv=new Civil();
		
		Is.Branch();
		Is.Sem();
		Is.Usn();
		Is.Result();
		m.Branch();
		m.Sem();
		m.Usn();
		m.Result();
	cs.Branch();
		cs.Sem();
		cs.Usn();
		cs.Result();
		cv.Branch();
		cv.Sem();
		cv.Usn();
		cv.Result();
		
	}
}

