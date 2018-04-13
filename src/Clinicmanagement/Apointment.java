package Clinicmanagement;

public class Apointment 

{
private String doctorname;
private long doctorapointments;
private String patientname;
private long contactnumber;
public String getDoctorname() {
	return doctorname;
}
public void setDoctorname(String doctorname) {
	this.doctorname = doctorname;
}
public long getDoctorapointments() {
	return doctorapointments;
}
public void setDoctorapointments(long doctorapointments) {
	this.doctorapointments = doctorapointments;
}
public String getPatientname() {
	return patientname;
}
public void setPatientname(String patientname) {
	this.patientname = patientname;
}
public long getContactnumber() {
	return contactnumber;
}

public void setContactnumber(long contactnumber) {
	this.contactnumber = contactnumber;
}
@Override
public String toString() {
	return "Apointment [doctorname=" + doctorname + ", doctorapointments=" + doctorapointments + ", patientname="
			+ patientname + ", contactnumber=" + contactnumber + "]";
}
public Apointment() {
	
}

public Apointment(String doctorname, long doctorapointments, String patientname, long contactnumber) {
	super();
	this.doctorname = doctorname;
	this.doctorapointments = doctorapointments;
	this.patientname = patientname;
	this.contactnumber = contactnumber;
}

}
