package za.co.unisa.models;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
private String firstName;
private String lastName;
private String email;
private  String phoneNumber;
private  String dateOfBirth;
private String course;
private String maritalStatus;

public Student(String firstName, String lastName, String email, String phoneNumber, String dateOfBirth,
		String course, String maritalStatus) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.dateOfBirth = dateOfBirth;
	this.course = course;
	this.maritalStatus = maritalStatus;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getMaritalStatus() {
	return maritalStatus;
}
public void setMaritalStatus(String maritalStatus) {
	this.maritalStatus = maritalStatus;
}
@Override
public int hashCode() {
	return Objects.hash(course, dateOfBirth, email, firstName, lastName, maritalStatus, phoneNumber);
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
	return Objects.equals(course, other.course) && Objects.equals(dateOfBirth, other.dateOfBirth)
			&& Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
			&& Objects.equals(lastName, other.lastName) && Objects.equals(maritalStatus, other.maritalStatus)
			&& Objects.equals(phoneNumber, other.phoneNumber);
}
@Override
public String toString() {
	return "Student [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber="
			+ phoneNumber + ", dateOfBirth=" + dateOfBirth + ", course=" + course + ", maritalStatus=" + maritalStatus
			+ "]";
}


}
