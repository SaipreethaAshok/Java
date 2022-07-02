package Exception.Handling;

public class Excepex {
public static void main(String args[])
{
	try {
		int arr[]= {5,0,2,3};
		try {
			int x=arr[3]/arr[1];
		}
		catch(ArithmeticException e){
			System.out.println("Divide by zero");
		}
		arr[4]=5;
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index out of bound exception");
	}
}
}
