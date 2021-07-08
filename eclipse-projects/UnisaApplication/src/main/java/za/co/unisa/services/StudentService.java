package za.co.unisa.services;

import za.co.unisa.dao.JdbcConnection;
import za.co.unisa.models.Student;

public class StudentService {
	public String register(Student student) {
		String studentQuery = "INSERT INTO Student(first_name, last_name, email, phone_number, date_Of_Birth, course,maritalStatus)"
				+ "VALUES('" + student.getFirstName() + "','" + student.getLastName() + "','"
				+ student.getEmail() + "','" + student.getPhoneNumber() + "','"
		
			+ student.getDateOfBirth() + "','" + student.getCourse() +"','"+student.getMaritalStatus()+ "')";
	
	JdbcConnection jdbc=new JdbcConnection();
	System.out.println(studentQuery);
	
	return jdbc.insert(studentQuery);
	}
	

}
