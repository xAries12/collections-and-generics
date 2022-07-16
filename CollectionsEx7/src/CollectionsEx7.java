import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class CollectionsEx7 {
public static void main(String[] args) {
	Student s1= new Student(1,"Ionut");
	Student s2= new Student(2,"Matei");
	Student s3= new Student(3,"Florin");
	Student s4= new Student(4,"Bogdan");
	Student s5= new Student(5,"Andreea");
	ArrayList<Student> list = new ArrayList<>(Set.of(s1,s2,s3,s4,s5));
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
}
}
