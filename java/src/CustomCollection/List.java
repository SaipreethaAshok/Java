package CustomCollection;

import java.util.ArrayList;
public class List {

	public static void main(String[] args) {
		java.util.List<Integer> list=new ArrayList();
		java.util.List<Integer> list1=new ArrayList();
		Integer num=12;
		list.add(10);
		list.add(0,20);
		list.add(num);
		list.add(1,89);
		list1.addAll(list);
		
		//tp print as an collection 
		System.out.println(list);
		System.out.println(list1);
	}

}
