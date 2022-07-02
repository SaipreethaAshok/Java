package c2tc.packagesexamples;

import c2tc.enacapsulation.entities.*;
import java.util.Scanner;

public class Main {
public static void main(String args[])
{
	Scanner scanner=new Scanner(System.in);
	Student s=new Student(2101728,"Preetha");
	C2TC c=new C2TC("Sanjana","Damini");
	s.display();
	c.display();
	}
}
