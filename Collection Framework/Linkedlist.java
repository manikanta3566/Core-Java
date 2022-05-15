import java.util.LinkedList;
import java.util.Collections;
public class Linkedlist{
public static void main(String[] args) {
	LinkedList<Integer> a=new LinkedList<Integer>();
	LinkedList<Integer> a1=new LinkedList<Integer>(a);
	a.add(1);
	a.add(23);
	a.add(4);
	System.out.println(a);
	a.add(1,20);//adds element at mentioned index
	System.out.println(a);
	//a.clear();
	System.out.println(a);
	System.out.println(a.contains(1));//boolean
	System.out.println(a.get(1));
	System.out.println(a.indexOf(23));
	System.out.println(a.isEmpty());//boolean
	System.out.println(a.lastIndexOf(4));
	System.out.println(a.remove(1));
	System.out.println(a);
Collections.sort(a);
System.out.println(a);
a1.add(21);
a1.add(22);
a1.addAll(a);
System.out.println(a1);
a1.addFirst(100);
a1.addLast(200);
System.out.println(a1);
System.out.println(a1.getFirst());
System.out.println(a1.getLast());
System.out.println(a1.peek());//display the first element but dosenot delete the first element
System.out.println(a1.poll());//display the first element but delete the first element
System.out.println(a1);

}
}
