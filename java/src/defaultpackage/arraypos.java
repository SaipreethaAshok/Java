package defaultpackage;

import java.util.Scanner;

public class arraypos {
public static void main(String args[])
{
	boolean flag=false;
	int i;
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]=new int[size];
	for(i=0;i<size;i++)
		arr[i]=sc.nextInt();
	int key=sc.nextInt();
	for(i=0;i<size;i++)
	{
		if(arr[i]==key)
			flag=true;
	}
	if(flag)
		System.out.println("Position of "+key+ " is " +(i+1));
	else
		System.out.println("Element not found");
}
}
