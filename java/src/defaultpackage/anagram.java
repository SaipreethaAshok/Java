package defaultpackage;
import java.util.Arrays;
import java.util.Scanner;
public class anagram {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String s2=sc.next();
	char temp;
	char arr1[]=s1.toLowerCase().toCharArray();
	char arr2[]=s2.toLowerCase().toCharArray();
	if(s1.length()!=s2.length())
	{
		System.out.println("Not Anagram");
	}
	else
	{
		for(int i=0;i<s1.length();i++)
			for(int j=i+1;j<s1.length();j++)
				if(arr1[i]>arr1[j])
				{
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
				s1=new String(arr1);
				Arrays.sort(arr2);
				s2=new String(arr2);
				if(s1.equalsIgnoreCase(s2))
					System.out.println("Anagram");
				else
					System.out.println("Not Anagram");
			}
			}
		}
	



