package concurrentex;

import java.util.concurrent.CopyOnWriteArraySet;

public class copyonwriteex2 {
public static void main(String args[])
{
	CopyOnWriteArraySet<Integer> set=new CopyOnWriteArraySet<Integer>();
	set.add(1);
	set.add(2);
	set.add(3);
	set.add(4);
	set.add(5);
	System.out.println("Is Element contains:"+set.contains(1));
	System.out.println("Is set empty:"+set.isEmpty());
	System.out.println("Remove element from set:"+set.remove(set));
	System.out.println("Element from set:"+set);
}
}
