
public class Student implements Comparable<Student> {
int cods;

@Override
public String toString() {
	return "Student [cods=" + cods + ", nume=" + nume + "]";
}
public Student(int cods, String nume) {
	super();
	this.cods = cods;
	this.nume = nume;
}
String nume;
public int getCods() {
	return cods;
}
public void setCods(int cods) {
	this.cods = cods;
}
public String getNume() {
	return nume;
}
public void setNume(String nume) {
	this.nume = nume;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + cods;
	result = prime * result + ((nume == null) ? 0 : nume.hashCode());
	return result;
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
	if (cods != other.cods)
		return false;
	if (nume == null) {
		if (other.nume != null)
			return false;
	} else if (!nume.equals(other.nume))
		return false;
	return true;
}
@Override
public int compareTo(Student o) {
	return this.cods-o.cods;
}

}
