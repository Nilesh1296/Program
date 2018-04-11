package Clinicmanagement;

public class Doctor 
{
 private String doctorname;
 private  Long doctorid;
 private String specialization;
 private String availibilty;
 private Long apointment;
public String getDoctorname() {
	return doctorname;
}
public void setDoctorname(String doctorname) {
	this.doctorname = doctorname;
}
public Long getDoctorid() {
	return doctorid;
}
public void setDoctorid(Long doctorid) {
	this.doctorid = doctorid;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public String getAvailibilty() {
	return availibilty;
}
public void setAvailibilty(String availibilty) {
	this.availibilty = availibilty;
}

public Long getApointment() {
	return apointment;
}
public void setApointment(Long apointment) {
	this.apointment = apointment;
}
public Doctor(String doctorname, Long doctorid, String specialization, String availibilty, Long noofpatients, Long apointment) {
	super();
	this.doctorname = doctorname;
	this.doctorid = doctorid;
	this.specialization = specialization;
	this.availibilty = availibilty;
	this.apointment = apointment;
}
public Doctor() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Doctor [doctorname=" + doctorname + ", doctorid=" + doctorid + ", specialization=" + specialization
			+ ", availibilty=" + availibilty + ", apointment=" + apointment + "]";
}
 
 
 
}
