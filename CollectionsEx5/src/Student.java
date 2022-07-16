
public class Student {
String name;
public Student(String name, int grade, int personalCode) {
	super();
	this.name = name;
	this.grade = grade;
	this.personalCode = personalCode;
}
int grade;
int personalCode;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getGrade() {
	return grade;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + personalCode;
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
	if (personalCode != other.personalCode)
		return false;
	return true;
}
public void setGrade(int grade) {
	this.grade = grade;
}
public int getPersonalCode() {
	return personalCode;
}
public void setPersonalCode(int personalCode) {
	this.personalCode = personalCode;
}
@Override
public String toString() {
	return "Student [name=" + name + ", grade=" + grade + ", personalCode=" + personalCode + "]";
}
}
