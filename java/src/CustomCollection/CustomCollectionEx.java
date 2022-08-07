package CustomCollection;

import java.util.HashSet;
import java.util.Set;

public class CustomCollectionEx {

	public static void main(String[] args) {
		Set<Student> set=new HashSet();
		Student student=new Student();
		student.setUid(101);
		student.setName("Jhon");
		set.add(student);
		Student student1=new Student();
		student1.setUid(102);
		student1.setName("Nick");
		set.add(student1);
		Student student2=new Student();
		set.add(student2);
		student2.setUid(103);
		student2 .setName("Rhin");
		set.add(student2);
		for(Student stud:set)
		System.out.println(set);
	}

}
