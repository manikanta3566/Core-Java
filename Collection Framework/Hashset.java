//Hashset will remove the duplicate values
//it doesnot guarentess the order of set in particular
import java.util.Collections;
import java.util.HashSet;

class Hashset{
	public static void main(String[] args) {
		HashSet<Integer> a=new HashSet<Integer>();
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
	}
}