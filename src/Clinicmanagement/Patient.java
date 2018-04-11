package Clinicmanagement;

public class Patient 
{
private String patientname;
private long patientid;
private long mobilenumber;
private int age;
public String getPatientname() {
	return patientname;
}
public void setPatientname(String patientname) {
	this.patientname = patientname;
}
public Long getPatientid() {
	return patientid;
}
public void setPatientid(Long patientid) {
	this.patientid = patientid;
}
public long getMobilenumber() {
	return mobilenumber;
}
public void setMobilenumber(long mobilenumber) {
	this.mobilenumber = mobilenumber;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Patient(String patientname, Long patientid, long mobilenumber, int age) {
	super();
	this.patientname = patientname;
	this.patientid = patientid;
	this.mobilenumber = mobilenumber;
	this.age = age;
}
public Patient() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Patient [patientname=" + patientname + ", patientid=" + patientid + ", mobilenumber=" + mobilenumber
			+ ", age=" + age + "]";
}


}
