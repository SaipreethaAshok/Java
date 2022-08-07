package concurrentex;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
public class concurrenthashmapex {

	public static void main(String[] args) {
		ConcurrentHashMap<String,String>hashMap=new ConcurrentHashMap<String,String>();
		hashMap.put("Nick","20SS01");
		hashMap.put("Jhon","20SS02");
		hashMap.put("Ron","20SS03");
		for(String key:hashMap.keySet())
		{
			System.out.println("Key from Map:"+key);
			System.out.println("Value from Map:"+hashMap.get(key));
		}
		
	}

}
