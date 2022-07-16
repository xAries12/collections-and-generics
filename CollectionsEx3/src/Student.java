
public class Student {
 int nrm;
 String nume;
 String prenume;
 public int getNrm(){
	 return nrm;
 }
 public String getNume() {
	 return nume;
 }
 public String getPrenume() {
	 return prenume;
 }
 public void setNrm(int nrm) {
	 this.nrm=nrm;
 }
 public void setNume(String nume) {
	 this.nume=nume;
 }
 public void setPrenume(String prenume) {
	 this.prenume=prenume;
 }

public Student(int nrm, String nume, String prenume) {
	super();
	this.nrm = nrm;
	this.nume = nume;
	this.prenume = prenume;
}
public String toString() {
	return "Student [nrm=" + nrm + ", nume=" + nume + ", prenume=" + prenume + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + nrm;
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
	if (nrm != other.nrm)
		return false;
	return true;
}
 
}
