package concurrentex;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentEx extends Thread {
	public void run()
	{
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println("Child Thread going to add element");
		}
		ConcurrentEx l = null;
		l.add("D");
	}
	private static void add(String string) {
		// TODO Auto-generated method stub
		
	}
}
