package defaultpackage;
import java.util.*;
import java.io.*;
public class evenodd {
	static int isEven(int n)
	{
		return(n&1);
	}
	public static void main(String args[])
	{
		int n= 123;
		if(isEven(n)==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}
