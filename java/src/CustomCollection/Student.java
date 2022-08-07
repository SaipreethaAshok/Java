package CustomCollection;

import java.util.Objects;

public class Student {
private int Uid;
private String name;

public Student()
{
	
}
public Student(int uid, String name) {
	super();
	this.Uid = uid;
	this.name = name;
}
public int getUid() {
	return Uid;
}
public void setUid(int uid) {
	this.Uid = uid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [Uid=" + Uid + ", name=" + name + "]";
}

}

/*@Override
/*public int hashCode() {
	return Objects.hash(name, Uid);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return Objects.equals(name, other.name) && Uid == other.Uid;
}
public String toString()
{
	return "Student [uid=" +Uid+ ",name=" +name+ "]";
}
}*/
