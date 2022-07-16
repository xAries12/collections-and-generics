import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class CollectionsEx5 {
public static void main(String[] args) {
	Student s1 = new Student("Ionut",9,1);
	Student s2 = new Student("Stefan",10,2);
	Student s3 = new Student("Ionut",7,3);
	Student s4 = new Student("Ionut",7,3);	
	Student s5 = new Student("Ionut",7,5);
	ArrayList<Student> listofstudent= new ArrayList<>(Set.of(s1,s2,s3));
	checkifexists(listofstudent, s4);
	checkifexists(listofstudent, s5);
}
public static void checkifexists(ArrayList<Student> a,Student b) {
	if(a.contains(b)) System.out.println("True");
	else System.out.println("False");
}
}
