package defaultpackage;

public class Operation {
int data=50;
 int  change(int data)
{
	data=data+100;
	return data;
}
public static void main(String args[])
{
	Operation op=new Operation();
	System.out.println("Before Change "+op.data);
	op.data=op.change(500);
	System.out.println("After Change "+op.data);
}
}
