package concurrentex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class concurrenthashmapex1 {

public static void main(String args[])
{
	Map<Integer,String> map=new HashMap();
	map.put(1001,"Barn");
	map.put(1002,"Cavin");
	map.put(1003,"Jhon");
	System.out.println("Print all values");
	System.out.println(map);
	map.remove(1003);
	System.out.println("Print Individual Item");
	for(Integer key:map.keySet())
	{
		System.out.println(map.get(key));
	}
	
	map.put( 1003,"Teddy");
	System.out.println("Print individual item using keyset");
	for(Integer key:map.keySet());
	{
		Object key = null;
		System.out.println(map.get(key));
	}
	/*Iterator<Integer> itr=key.iterator();
	while(itr.hasNext())
	{
		Integer id=itr.next();
		map.get(id);
	}*/
	
	map.put(1004,"Jack");
	System.out.println(map);
	}
}
