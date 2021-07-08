package za.co.unisa.controllers;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import za.co.unisa.dao.JdbcConnection;
import za.co.unisa.models.Student;
import za.co.unisa.services.StudentService;
//@WebServlet("/register")
//@WebServlet("/register");
public class RegistrationServlet extends HttpServlet {
	
public RegistrationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	//LocalDate d= null;
	//private JdbcConnection conn=new JdbcConnection();


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest req,HttpServletResponse response) {

}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalDate date=null;
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String phoneNumber = request.getParameter("phoneNumber");
		String dateOfBirth = request.getParameter("dateOfBirth");
		String course = request.getParameter("course");
		String maritalStatus = request.getParameter("maritalStatus");
		
		System.out.println("FirstName is: " + firstName + ", "
				+ "lastName is:" +  lastName + ","
		        + "Email is :" +  email + ","
				+ "PhoneNumber is: " + phoneNumber + ","
				+ "Course is: " + course + ","
				+ "DateOfBirth is :" + dateOfBirth + ","
				+ "MaritalStatus is: " + maritalStatus);


	
Student student= new Student(firstName,lastName,email,phoneNumber,dateOfBirth,course,maritalStatus);

//JdbcConnection conn=new JdbcConnection();
StudentService sv=new StudentService();
String register=sv.register(student);
//String result=conn.insert(student);
System.out.println(register);
//response.sendRedirect("studentDetails.jsp");
request.setAttribute("message" ,register);
request.getRequestDispatcher("WEB-INF/studentDetail.jsp").forward(request, response);
//esponse.getWriter().print(register);	
}
}