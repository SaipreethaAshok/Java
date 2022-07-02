package interfaceexamples;

public class Student implements C2TC,College {
	
	public void onlinesession()
	{
		System.out.println("Session happens in Zoom");
	}
	public void offlinesession()
	{
		System.out.println("Session happens in College");
	}
}
