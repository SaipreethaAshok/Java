package DateExample;

import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println("Printing the date using no");
		System.out.println(date);
		
		long d=(long) 20220721;
		Date date2=new Date(d);
		System.out.println("With milliseconds");
		//System.out.println("Printing the dates");
		//System.out.println(date);
		System.out.println(date2);

	}

}
