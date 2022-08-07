package concurrentex;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("Jack","Brownie","David");
		CopyOnWriteArrayList<String>c=new CopyOnWriteArrayList<String>(list);
		System.out.println("Without modification="+c);
		Iterator<String>iterator1=c.iterator();
		c.add("Hii..");
        System.out.println("After modification="+c);
        Iterator<String>iterator2=c.iterator();
        System.out.println("Element from first Iterator:");
        iterator1.forEachRemaining(System.out::println);
        System.out.println("Element from Second Iterator:");
        iterator2.forEachRemaining(System.out::println);

	}

}
