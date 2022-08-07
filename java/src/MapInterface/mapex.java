package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapex {
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
	for(Map.Entry<Integer,String>m:map.entrySet())
	{
		System.out.println(m);
	}
	
	map.put( 1004,"Teddy");
	System.out.println("Print individual item using keyset");
	Set<Integer> key=map.keySet();
	Iterator<Integer> itr=key.iterator();
	while(itr.hasNext())
	{
		Integer id=itr.next();
		map.get(id);
	}
	
	map.put(1001,"Barn");
	System.out.println(map);
	
	/*map.put(null,"Barn");
	System.out.println(map);
	
	map.put(1001,null);
	System.out.println(map);
	
	map.put(null,null);
	System.out.println(map);*/
}
}
