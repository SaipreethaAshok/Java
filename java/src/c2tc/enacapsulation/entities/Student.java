package c2tc.enacapsulation.entities;

public class Student extends C2TC {
	private int UID;
	private String name;
	public Student(int uID, String name) {
		super("Sanjana","Damini");
		UID = uID;
		this.name = name;
	}
	public int getUID() {
		return UID;
	}
	public void setUID(int uID) {
		UID = uID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display() {
	System.out.println(UID +" : "+name);
		
	}
}
