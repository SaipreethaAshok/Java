package defaultpackage;

public class ex {
public static void main(String args[])
{
	String s="Great",t="";
	String u=s.concat(t);
	if(u==s)
	{
		System.out.println("Same");
	}
		else
		System.out.println(" Not Same");
		String e=s+t;
		if(e==s)
			System.out.println("Same");
		else
			System.out.println("Not Same");
}
}

