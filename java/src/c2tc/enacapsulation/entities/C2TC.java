package c2tc.enacapsulation.entities;

public class C2TC {
private String Techtrainer;
private String SStrainer;

public String getTechtrainer() {
	return Techtrainer;
}
public void setTechtrainer(String techtrainer) {
	Techtrainer = techtrainer;
}
public String getSStrainer() {
	return SStrainer;
}
public void setSStrainer(String sstrainer) {
	SStrainer = sstrainer;
}
public C2TC(String techtrainer,String sstrainer)
{
	super();
	Techtrainer=techtrainer;
	SStrainer=sstrainer;
}
public void display() {
	System.out.println("The classes are conducted by "+Techtrainer+ " and "+SStrainer);
	}
}
