package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WithStream {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str[]=new String[5];
		System.out.println("Give the input Strings");
		for(int i=0;i<5;i++)
			str[i]=sc.next();
		List<String> list=Arrays.asList(str);
		System.out.println("Print it space separated");
		System.out.println(list.stream().collect(Collectors.joining(",")));
		System.out.println("Print it as a list");
		System.out.println(list.stream().collect(Collectors.toList()));
		System.out.println("Convert the Strings to Upper Case");
		System.out.println(list.stream().map(s->s.toUpperCase()).collect(Collectors.toList()));
		System.out.println("Print the String whose length is greater than 2");
		System.out.println(list.stream().filter(s->s.length()>2).collect(Collectors.toList()));
		System.out.println("Print the Strings whose length is lesser than 2");
		System.out.println(list.stream().filter(s->s.length()<2).collect(Collectors.toList()));
	}
}
