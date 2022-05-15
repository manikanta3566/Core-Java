import java.util.ArrayList;
import java.util.Collections;
public class Arraylist{
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList<Integer>();
	ArrayList<Integer> a1=new ArrayList<Integer>(a);
	a.add(1);
	a.add(23);
	a.add(4);
	System.out.println(a);
	a.add(1,20);
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
//a1.addFirst(100);//In arraylist we cant add element at first using Addfirst method
//a1.addLast(200);//In arraylist we cant add element at last using Addlast method
System.out.println(a1);
//System.out.println(a1.getFirst());//In arraylist we cant get element  using getfirst method
//System.out.println(a1.getLast());//In arraylist we cant get element  using getlast method
//System.out.println(a1.peek());//doesnot supports this methods
//System.out.println(a1.poll());//doesnot supports this methods

}
}
