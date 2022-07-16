import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionsEx3 {
	public static void main(String[] args) {
		Student s1 = new Student(112,"Popescu","Ionut");
		Student s2 = new Student(113,"Micu","Stefan");
		Student s3 = new Student(112,"Popescu","Ionut");
		ArrayList<Student> listofStudents= new ArrayList<>();
		listofStudents.add(s1);
		listofStudents.add(s2);
		listofStudents.add(s3);
		HashSet<Student> studentlist = new HashSet<>(listofStudents);
		System.out.println(studentlist);
	}
}
