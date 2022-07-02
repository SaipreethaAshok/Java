package packageex.government;
class Test
{
	 static int a;
	 static 
	 {
		 a=4;
		 System.out.println("inside static blocks");
		 System.out.println("a="+a);
	 }
	 Test()
	 {
		 System.out.println("inside Coms");
		 a=10;
	 }
	 public static void func()
	 {
		 a=a+1;
		 System.out.println("a="+a);
	 }
	 public static void main(String args[])
	 {
		 Test ob=new Test();
		 ob.func();
	 }
}

