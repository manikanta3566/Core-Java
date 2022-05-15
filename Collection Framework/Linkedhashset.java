//LinkedHashset will remove the duplicate values
//it guarentess the order of set in particular
import java.util.Collections;
import java.util.LinkedHashSet;

class Linkedhashset{
	public static void main(String[] args) {
		LinkedHashSet<Integer> a=new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> a1=new LinkedHashSet<Integer>(a);
		a.add(1);
		a.add(2);
		a.add(2);
		a.add(3);
		a.add(5);
		a.add(4);
		a.add(8);
		a.add(22);
		a.add(12);
		a.remove(3);
		a.add(90);
		a.add(100);
		a.add(101);
		a.add(200);
		a.add(150);
		System.out.println(a);
		a1.addAll(a);
		a1.add(900);
		
		System.out.println(a1);
	}
}